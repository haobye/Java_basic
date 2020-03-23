package item03optimize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
优化：
    1、改变命名规则
    2、可以传输多个文件
    3、提高server接收文件的效率
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7777);

        //让服务器一直处于监听状态，客户端上传一个文件，就保存一个文件
        while(true){
            Socket socket = server.accept();

            //使用多线程，提高效率，每个客户端开一个线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        File file = new File("F:\\item\\upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        //自定义文件命名规则，防止同名文件被覆盖：域名+毫秒值+随机数
                        String filename = "hao"+System.currentTimeMillis()+new Random().nextInt(999999)+".png";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes)) != -1){
                            fos.write(bytes, 0,len);
                        }
                        socket.getOutputStream().write("上传完成".getBytes());

                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
        //服务器不用就关闭
        //server.close();
    }
}
