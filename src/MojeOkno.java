import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MojeOkno extends JFrame {
	
	private JPanel contentPane;
	private ImageIcon icon;
	private Image scaleImage;
	private JLabel lblNewLabel;
	private int i=0;
	private JButton btnVychod;
	private JButton btnZapad;
	private JButton btnJih;
	private JButton Sever;
	JLabel label = new JLabel();
	/*public MojeOkno() {
		Mapa m = new Mapa("mapa.csv");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Sever = new JButton("Sever");
		Sever.requestFocus(); 
		Sever.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	            Sever.requestFocus(); 
	            final int sever=0;
	            try {
					m.jdiNa(sever);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					label.setText(e.getMessage());
					return;
				}
	            label.setText(m.getMapa().get(m.getAktualniPoloha()).getNazev());
	            icon = new ImageIcon(obrazky()[m.getAktualniPoloha()]);
	            scaleImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
	    		icon = new ImageIcon(scaleImage);
	            lblNewLabel.setIcon(icon);
	         }
	      });
		
		btnVychod = new JButton("Vychod");
		btnVychod.requestFocus();
		btnVychod.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	        	btnVychod.requestFocus(); 
	            final int vychod=1;
	            try {
					m.jdiNa(vychod);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					label.setText(e.getMessage());
					return;
				}
	            label.setText(m.getMapa().get(m.getAktualniPoloha()).getNazev());
	            icon = new ImageIcon(obrazky()[m.getAktualniPoloha()]);
	            scaleImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
	    		icon = new ImageIcon(scaleImage);
	            lblNewLabel.setIcon(icon);
	         }
	      });
		
		btnZapad = new JButton("Zapad");
		btnZapad.requestFocus();
		btnZapad.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	        	 btnZapad.requestFocus(); 
	            final int zapad=3;
	            try {
					m.jdiNa(zapad);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					label.setText(e.getMessage());
					return;
				}
	            label.setText(m.getMapa().get(m.getAktualniPoloha()).getNazev());
	            icon = new ImageIcon(obrazky()[m.getAktualniPoloha()]);
	            scaleImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
	    		icon = new ImageIcon(scaleImage);
	            lblNewLabel.setIcon(icon);
	         }
	      });
		btnJih = new JButton("Jih");
		btnJih.requestFocus();
		btnJih.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	        	btnJih.requestFocus();
	            final int jih=2;
	            try {
					m.jdiNa(jih);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					label.setText(e.getMessage());
					return;
				}
	            label.setText(m.getMapa().get(m.getAktualniPoloha()).getNazev());
	            icon = new ImageIcon(obrazky()[m.getAktualniPoloha()]);
	            scaleImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
	    		icon = new ImageIcon(scaleImage);
	            lblNewLabel.setIcon(icon);
	         }
	      });
		
		icon = new ImageIcon(obrazky()[m.getZacatek()]);
		scaleImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		icon = new ImageIcon(scaleImage);
		lblNewLabel = new JLabel(icon);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		label.setText(m.getMapa().get(10).getNazev());
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(91)
					.addComponent(btnZapad, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnJih, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVychod, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(110, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(184)
					.addComponent(Sever, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(203, Short.MAX_VALUE))
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(141)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(168, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Sever, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVychod, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnZapad, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnJih, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}*/
	public String[] obrazky() {
		String[] obrazky = {"Uganda.jpg", "Argentina.jpg", "Estonsko.png", "Mongolsko.png", "Rusko.png", "Uzbekistan.png", "Severní korea.png", "Nový zeland.png", "Iran.png", "Eritrea.jpg", "Èesko.png"};
		return obrazky;
	}
}