package com.person.learning.Excercise.Multitreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class RunnableThreadCreationExample2 {
public static void main(String[] args) {
	
}
}
class Call implements Runnable{

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		while(true) {
			try {
				serverSocket = new ServerSocket(6555);
				Socket socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println("Client Side :"+bufferedReader.readLine() );
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				try {
					serverSocket.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}