package bank;

import javax.swing.JOptionPane;

/*
 * ��ҪдȡǮwithdraw()��������Ҫ��ԤԼ���ܣ�	ok
 * ���йر��˻�û���
 * 
 */
public class SaverAccount extends Account {
	private int rsvDeposit = 0;		//�Ƿ���ԤԼȡ�����.0->û�У�����ȡ�.1->�Ѿ�ԤԼ����û�����µ�½2.->����ȡ��
	
	public SaverAccount (){
		type = 0;
	}
	
	public int getRsvDeposit() {
		return rsvDeposit;
	}
	public void setRsvDeposit() {	//ԤԼ
		if(rsvDeposit == 0 || rsvDeposit == 1){
			rsvDeposit = 1;
		}
		JOptionPane.showMessageDialog(null,"Reserve successful!","Information",JOptionPane.INFORMATION_MESSAGE);
	}
	public void setRsvDeposit(int value){
		rsvDeposit = 2;
	}
	
	public void withdraw(){
		int withdraw;
		
		String withdrawStr = JOptionPane.showInputDialog("Please input the value that you would like to deposit: ");
		try{
			 withdraw = Integer.parseInt(withdrawStr);
			 if(rsvDeposit == 2){
				 if(withdraw > balance){
					 JOptionPane.showMessageDialog(null,"You can't withdraw more than your balance!","Information",JOptionPane.INFORMATION_MESSAGE);
					 return ;
						//System.out.println("You can't withdraw more than your balance.!");
						//���ع��ܲ˵�
				 }
				 else{
					 balance -= withdraw;
					 rsvDeposit = 0;
					 JOptionPane.showMessageDialog(null,"You have withdraw $" + withdraw + " successfully!\n"
							 + "You remain $"  + balance + " in your account.","Information",JOptionPane.INFORMATION_MESSAGE);
					//���ع��ܲ˵�
					 return ;
				 }
			 }
			 else{
				 JOptionPane.showMessageDialog(null,"You have to reserve first!","Information",JOptionPane.INFORMATION_MESSAGE);
				 return ;
			 }
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Input Invalid.\nPlease try again.","Information",JOptionPane.INFORMATION_MESSAGE);
			return ;
		}
	}
	
	//ʵ��һ�¾�̬�ࡣ��
	public void refund(){}
	public int getOverdraw(){return 0;}
}
