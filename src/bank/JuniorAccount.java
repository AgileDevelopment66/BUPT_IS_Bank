package bank;

import javax.swing.JOptionPane;

/*
 * ��ҪȡǮwithdraw()��������ͨ��				ok
 * ֻ��16�����¿���ʹ�ñ��˻�������������ʵ�֣�
 * �����saveraccountһ��
 * ���йر��˻�û���
 * 
 */
public class JuniorAccount extends Account {
	
	public JuniorAccount (){
		type = 1;
	}
	
	public void withdraw(){
		int withdraw;
		
		String withdrawStr = JOptionPane.showInputDialog("Please input the value that you would like to deposit: ");
		try{
			 withdraw = Integer.parseInt(withdrawStr);
			 if(withdraw > balance){
				 JOptionPane.showMessageDialog(null,"You can't withdraw more than your balance!","Information",JOptionPane.INFORMATION_MESSAGE);
				 return ;
					//System.out.println("You can't withdraw more than your balance.!");
					//���ع��ܲ˵�
				}
				else{
					balance -= withdraw;
					JOptionPane.showMessageDialog(null,"You have withdraw $" + withdraw + " successfully!\n"
							+ "You remain $"  + balance + " in your account.","Information",JOptionPane.INFORMATION_MESSAGE);
//					System.out.println("You have withdraw $" + withdraw + " successfully!");
//					System.out.println("You remain $" + balance + " in your account.");
					//���ع��ܲ˵�
				}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Input Invalid.\nPlease try again.","Information",JOptionPane.INFORMATION_MESSAGE);
			return ;
		}	
	}
	
	//ʵ��һ�¾�̬�ࡣ��
		public int getRsvDeposit(){return 0;}
		public void setRsvDeposit(){}
		public void refund(){}
		public int getOverdraw(){return 0;}
		public void setRsvDeposit(int value){}
}
