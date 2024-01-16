package TrainTicket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent;

public class RailwayTicket implements ActionListener {
	//Container container = getContentPane();
	 static void TrainListLabel(){
		 System.out.println("Train name\t Name of the train\t Arrival\t Departure\n");
	 }
	 static void ReservationLabel() {
		 
	 }
	 static void CancellationLabel() {
		 
	 }
	 static void TatkalLabel() {
		 
	 }
	 static void GeneralBookingLabel() {
		 
	 }
	 static void TrainStatus() {
		 
	 }

	 public void actionPerformed(ActionEvent e) {
			
			
	 }
	
	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setLayout(null);
		f.setVisible(true);
		JLabel StationLabel = new JLabel("Welcome to VIJAYAWADA RAILWAY STATION\n No.of platforms = 10\n No. of tracks = 22\n Pincode: 520001\n Helpline: 0866 257775\n Established in 1888");		
		JButton TrainListLabel = new JButton("Trains List");
		JButton ReservationLabel = new JButton("Reservations");
		JButton CancellationLabel = new JButton("Cancellations");
		JButton TatkalLabel = new JButton("Tatkal");
		JButton GeneralBookingLabel = new JButton("General Booking");
		JButton TrainStatus = new JButton("Train Status");
		
		StationLabel.setBounds(20, 20, 500, 20);
		TrainListLabel.setBounds(20, 60, 100, 20);
		ReservationLabel.setBounds(20, 90, 100, 20);
		CancellationLabel.setBounds(20,120 , 100, 20);
		TatkalLabel.setBounds(20, 150, 100, 20);
		GeneralBookingLabel.setBounds(20, 180, 100, 20);
		TrainStatus.setBounds(20, 210, 100, 20);
		
		TrainListLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				TrainListLabel();	
			}
		});		
		ReservationLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ReservationLabel();
			}
		});
		CancellationLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				CancellationLabel();
			}
		});
		TatkalLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				TatkalLabel();
;			}
		});
		GeneralBookingLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				GeneralBookingLabel();
			}
		});
		TrainStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				TrainStatus();
			}
		});
		
	}
	
}