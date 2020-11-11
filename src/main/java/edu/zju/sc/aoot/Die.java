package edu.zju.sc.aoot;

import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Die {
	private int side;
	private int top;
	//Ĭ��������6�棬��ʼʱ����1����
	public Die(){
		this.side = 6;
		this.top = 1;
	}
	public Die(int x){
		this.side = x;
		this.top = 1;
	}
	//�������ӵ�����
	public int numOfSide(){
		return this.side;
	}
	//��������Ӳ����ض�������
	public int roll(){
		int temp = this.side;
		int result = new Random().nextInt(temp) + 1;
		this.top = result;
		return result;
	}
	//���ض�������
	public int topFace(){
		return this.top;
	}
	public static void print(){
		File file = new File("d:/result.txt");
		Die die = new Die();
		float []rates = new float[7];
		int []returns = new int[7];
		for(int i = 0; i < 7; ++i){
			rates[i] = 0;
			returns[i] = 0;
		}
		for(int i = 0; i < 100000; ++i){
			int temp = die.roll();
			returns[temp]++;
		}
		for(int i = 1; i <= 6; ++i){
			rates[i] = (float)returns[i] / 1000;
		}
		try{
			FileWriter fw = new FileWriter(file);
			String data = "value,\ttimes of returned,\tpercentage\n";
			char[] cs = data.toCharArray();
			fw.write(cs);
			for(int i = 1; i <= 6; ++i){
				String input = i + ",\t" + returns[i] + ",\t\t" + String.format("%.2f", rates[i]).toString() + "%\n";
				char[] c = input.toCharArray();
				fw.write(c);
			}
			fw.close();
		}catch(IOException e){
            // TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
