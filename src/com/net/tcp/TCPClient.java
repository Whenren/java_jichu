package com.net.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		//创建客户端套接字,参数是服务器的IP地址和服务器开放的端口号，连接服务器
		Socket khdtjz=new Socket("10.2.103.31", 8899);
		//创建文件
		File wj=new File("d:\\1.jpg");
		//创建文件字节输入流，用上面的文件对象作为参数
		FileInputStream fin=new FileInputStream(wj);
		//要往服务器发送数据，必须通过所获得的客户端套接字创建输出流
		OutputStream os;
        //获取字节输出流，准备往网络中写数据
		os = khdtjz.getOutputStream();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		//直到文件结束
		while(b!=-1) {
			//写到网络中;
			os.write(zjhc,0,b);
			//再次读取文件
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		//客户端要接收数据，通过套接字获取输入流
		InputStream is=khdtjz.getInputStream();
		zjhc=new byte[1024];
		b=is.read(zjhc);
		while(b!=-1) {
			//System.out.println(b);
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}