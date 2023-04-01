package arquivos_exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String path = "C:/temp"; 
		
		
		List<Produto>list = new ArrayList<>();
		
		System.out.println("Entre com o caminho do arquivo: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		File file =  new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		System.out.println(sourceFolderStr);
		
		boolean succes = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Produto(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr)) ){
			
				
				for(Produto item : list) {
					bw.write(item.getNome()+","+String.format("%.2f",+item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr+" Criado");
			}catch(IOException e) {
				System.out.println("Erro em escrever o arquivo: "+ e.getMessage());
				
			}
			
		}catch(IOException e) {
			System.out.println("Erro em ler o arquivo "+ e.getMessage());
		}
		
		sc.close();
		
	}

}
