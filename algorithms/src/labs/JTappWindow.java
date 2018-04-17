package labs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class JTappWindow extends JFrame{

	JTabbedPane tabbedPane = new JTabbedPane();
	
	public JTappWindow() throws IOException{
		
		JPanel firstPanel = new JPanel();
		
		Box verbox = Box.createVerticalBox();
		
		firstPanel.setLayout(new FlowLayout());
		
		JLabel labelSc1 = new JLabel("Введіть перше число: ");
		JLabel labelSc2 = new JLabel("Введіть друге число: ");
		JLabel labelSc3 = new JLabel("Результат: ");
		JLabel labelSc4 = new JLabel("Час виконання: ");
		JLabel labelSc5 = new JLabel(" мс");
		
		
		JTextField number1 =  new JTextField();
		number1.setColumns(5);
		JTextField number2 = new JTextField();
		number2.setColumns(5);
		JButton result = new JButton("Enter!");
		JTextField fieldResult = new JTextField();
		fieldResult.setColumns(5);
		JTextField time = new JTextField();
		time.setColumns(3);
		
		
		firstPanel.add(labelSc1);
		firstPanel.add(number1);
		firstPanel.add(labelSc2);
		firstPanel.add(number2);
		firstPanel.add(result);
		firstPanel.add(labelSc3);
		firstPanel.add(fieldResult);
		firstPanel.add(labelSc4);
		firstPanel.add(time);
		firstPanel.add(labelSc5);
		
		
		
		JPanel secondPanel = new JPanel();
	
		secondPanel.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Введіть перше число: ");
		JLabel label2 = new JLabel("Введіть друге число: ");
		JLabel label3 = new JLabel("Результат: ");
		JLabel label4 = new JLabel("Час виконання: ");
		JLabel label5 = new JLabel(" мс");
		
		
		JTextField num01 =  new JTextField();
		num01.setColumns(5);
		JTextField num02 = new JTextField();
		num02.setColumns(5);
		JButton res01 = new JButton("Enter!");
		JTextField fR01 = new JTextField();
		fR01.setColumns(5);
		JTextField time01 = new JTextField();
		time01.setColumns(3);
		
		
		secondPanel.add(label1);
		secondPanel.add(num01);
		secondPanel.add(label2);
		secondPanel.add(num02);
		secondPanel.add(res01);
		secondPanel.add(label3);
		secondPanel.add(fR01);
		secondPanel.add(label4);
		secondPanel.add(time01);
		secondPanel.add(label5);
		
		JPanel thirdPanel = new JPanel();
		
		thirdPanel.setLayout(new FlowLayout());
		
		JLabel lab1 = new JLabel("Введіть перше число: ");
		JLabel lab2 = new JLabel("Введіть друге число: ");
		JLabel lab3 = new JLabel("Результат: ");
		JLabel lab4 = new JLabel("Час виконання: ");
		JLabel lab5 = new JLabel(" мс");
		
		
		JTextField n01 =  new JTextField();
		n01.setColumns(5);
		JTextField n02 = new JTextField();
		n02.setColumns(5);
		JButton r01 = new JButton("Enter!");
		JTextField f01 = new JTextField();
		f01.setColumns(5);
		JTextField t01 = new JTextField();
		t01.setColumns(3);
		
		
		thirdPanel.add(lab1);
		thirdPanel.add(n01);
		thirdPanel.add(lab2);
		thirdPanel.add(n02);
		thirdPanel.add(r01);
		thirdPanel.add(lab3);
		thirdPanel.add(f01);
		thirdPanel.add(lab4);
		thirdPanel.add(t01);
		thirdPanel.add(lab5);
		
		verbox.add(new JLabel("Алгоритм Евкліда: "));
		verbox.add(firstPanel);
		verbox.add(new JLabel("Алгоритм рекурсивний: "));
		verbox.add(secondPanel);
		verbox.add(new JLabel("Алгоритм перебору: "));
		verbox.add(thirdPanel);
		
		Box verbox2 = Box.createVerticalBox();
		
		Box verbox3 = Box.createVerticalBox();
		
		JPanel all = new JPanel();
		JPanel newPanel = new JPanel();
		JPanel newPanel2 = new JPanel();
		JPanel newPanel3 = new JPanel();
		JPanel newPanel4 = new JPanel();
		JPanel newPanel5 = new JPanel();
		JPanel newPanel6 = new JPanel();
		JPanel newPanel7 = new JPanel();
		JPanel newPanel8 = new JPanel();
		JPanel newPanel9 = new JPanel();
		
		all.setLayout(new BorderLayout());
		
		newPanel.setLayout(new FlowLayout());
		newPanel2.setLayout(new FlowLayout());
		newPanel3.setLayout(new FlowLayout());
		newPanel4.setLayout(new FlowLayout());
		newPanel5.setLayout(new FlowLayout());
		newPanel6.setLayout(new FlowLayout());
		newPanel7.setLayout(new FlowLayout());
		newPanel8.setLayout(new FlowLayout());
		newPanel9.setLayout(new FlowLayout());
		
		newPanel6.add(new JLabel("Попередньо вибравши найбільшу ф-цію, здійсни підстановку у рівняння, подане нижче, та обери найбільш схожий графік"));
		
		BufferedImage myPicture2 = ImageIO.read(new File("C:\\Users\\CodeBrain21\\Desktop\\1\\Screenshot_2.png"));
		JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
		newPanel8.add(picLabel2);
		
		BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\CodeBrain21\\Desktop\\1\\Screenshot_1.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		newPanel7.add(picLabel);
		
		JLabel lb01 = new JLabel("L1 = (n^3 + n^2 + n)^2 + log2(n)^2");
		JLabel lb02 = new JLabel("L2 = (5n^7 + 7n^5)/n^2 +1");
		JLabel lb03 = new JLabel("L3 = 2^(n+1) + (n+1)^2 + n + 1");
		JLabel lb04 = new JLabel("L4 = SQRT(n) + 2n");
		JLabel lb11 = new JLabel("          O1 = ");
		JLabel lb22 = new JLabel("          O2 = ");
		JLabel lb33 = new JLabel("          O3 = ");
		JLabel lb44 = new JLabel("          O4 = ");
		
		JLabel b1 = new JLabel();
		JLabel b2 = new JLabel();
		JLabel b3 = new JLabel();
		JLabel b4 = new JLabel();
		
		JTextField n11 =  new JTextField();
		n11.setColumns(5);
		JTextField n22 = new JTextField();
		n22.setColumns(5);
		JTextField n33 =  new JTextField();
		n33.setColumns(5);
		JTextField n44 = new JTextField();
		n44.setColumns(5);
		JButton startBtn = new JButton("Save changes");
		JButton func = new JButton("(from the top)... My function is №");
		JTextField n55 = new JTextField();
		n55.setColumns(1);
		
		JLabel lbl = new JLabel();
		
		newPanel9.add(lbl);
		
		newPanel.add(lb01);
		newPanel.add(lb11);
		newPanel.add(n11);
		newPanel.add(b1);
		
		
		newPanel2.add(lb02);
		newPanel2.add(lb22);
		newPanel2.add(n22);
		newPanel2.add(b2);
		
		
		newPanel3.add(lb03);
		newPanel3.add(lb33);
		newPanel3.add(n33);
		newPanel3.add(b3);
		
		
		newPanel4.add(lb04);
		newPanel4.add(lb44);
		newPanel4.add(n44);
		newPanel4.add(b4);
	
		newPanel5.add(startBtn);
		newPanel5.add(func);
		newPanel5.add(n55);
		
		verbox2.add(newPanel);
		verbox2.add(newPanel2);
		verbox2.add(newPanel3);
		verbox2.add(newPanel4);
		verbox2.add(newPanel5);
		
		verbox3.add(newPanel6);
		verbox3.add(newPanel8);
		verbox3.add(newPanel7);
		
		all.add(verbox2, BorderLayout.WEST);
		all.add(verbox3, BorderLayout.EAST);
		all.add(newPanel9,BorderLayout.SOUTH);
		
		tabbedPane.add("Laba 1",verbox);
		tabbedPane.add("Laba 2",all);
		
		
		
		add(tabbedPane);
	
		startBtn.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			   b1.setText(n11.getText());
			   n11.setText("");
			   b2.setText(n22.getText());
			   n22.setText("");
			   b3.setText(n33.getText());
			   n33.setText("");
			   b4.setText(n44.getText());
			   n44.setText("");
		   }
		});
		
		func.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent ae){				   
				   int num1 = Integer.parseInt(n55.getText());
				   switch(num1){
				   case 1: {
					   lbl.setText("Дуже повільне зростання необхідного часу");
					   break;
				   }
				   case 2: {
					   lbl.setText("Логарифмічне зростання — подвоєння розміру задачі збільшує час роботи на сталу величину");
					   break;
				   }
				   case 3: {
					   lbl.setText("Лінійне зростання — подвоєння розміру задачі подвоїть і необхідний час");
					   break;
				   }
				   case 4: {
					   lbl.setText("Лінеаритмічне зростання — подвоєння розміру задачі збільшить необхідний час трохи більше ніж вдвічі");
					   break;
				   }
				   case 5: {
					   lbl.setText("Квадратичне зростання — подвоєння розміру задачі вчетверо збільшує необхідний час");
					   break;
				   }
				   case 6: {
					   lbl.setText("Кубічне зростання — подвоєння розміру задачі збільшує необхідний час у вісім разів");
					   break;
				   }
				   case 7: {
					   lbl.setText("Експоненціальне зростання — збільшення розміру задачі на 1 призводить до c-кратного збільшення необхідного часу; подвоєння розміру задачі підносить необхідний час у квадрат");
					   break;
				   }
				   default: {
					   lbl.setText("Некоректно введено дані! Введіть номер функції ще раз");
					   break;
				   }
				   }
			   }
			});
		
		
		   
		
		
		
	result.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			   Long num1 = Long.parseLong(number1.getText());
			   Long num2 = Long.parseLong(number2.getText());
			   Lab1Task1 l = new Lab1Task1();
			   
			    long totalRuntime = 0;
				Long res = l.solve(Math.abs(num1), Math.abs(num2));
			    fieldResult.setText(String.valueOf(res.longValue()));
			    
			    
			    for(int i = 0; i < 100000; i++){
			    	long startTime = System.currentTimeMillis();
			    	Long res02 = l.solve(Math.abs(num1), Math.abs(num2));
					long endTime = System.currentTimeMillis();
					String runtime = String.valueOf(totalRuntime += (endTime - startTime));
					time.setText(runtime);
			    }
			    
		   }
		});
	
	res01.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			   Long num1 = Long.parseLong(num01.getText());
			   Long num2 = Long.parseLong(num02.getText());
			   Lab1Task2 l2 = new Lab1Task2();
			   
			    long totalRuntime = 0;
				
			
				Long res = l2.evklid(num1,num2);
				fR01.setText(String.valueOf(res.longValue()));
				
				for(int i = 0; i < 100000; i++){
					long startTime = System.currentTimeMillis();
					Long res02 = l2.evklid(num1,num2);
					long endTime = System.currentTimeMillis();
					String runtime = String.valueOf(totalRuntime += (endTime - startTime));
					time01.setText(runtime);
				}
		   }
		});
	
	r01.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			   Long num1 = Long.parseLong(n01.getText());
			   Long num2 = Long.parseLong(n02.getText());
			   Lab1Task3 l3 = new Lab1Task3();
			   
			    long totalRuntime = 0;
				
				Long res = l3.solve(num1,num2);
				f01.setText(String.valueOf(res));
					
				for(int i = 0; i < 100000; i++){
					long startTime = System.currentTimeMillis();
					Long res02 = l3.solve(num1,num2);
					long endTime = System.currentTimeMillis();
					String runtime = String.valueOf(totalRuntime += (endTime - startTime));
					t01.setText(runtime);
				}
		   }
		});
	
	
	
	

	}
}