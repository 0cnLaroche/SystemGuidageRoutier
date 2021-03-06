package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.ActionEvenement;
import modele.Graph;
//C'est l'écran de départ
public class FrmPanelSimulation extends JFrame {

	private JPanel panelSimulation;

	private PanelUtilisateur panelUtilisateur;

	/**
	 * Bouttons qui servent a genere des evenements (accident et traffic)
	 */
	private JButton genereAccident;
	private JButton genereTraffic;
	private JButton demarrerSimulation;

	/**
	 * Champs de saisi pour entre l'endroit ou on veut generer un evenement
	 */
	private JLabel routeArriver;
	private static JLabel routeDepart;
	private static JLabel infoRouteDepart;
	private static JLabel infoRouteArriver;
	
	private static JTextField routeArrSaisi;
	private static JTextField routeDepSaisi;
	private static JTextField premierNoeudRouteAccident;
	private static JTextField premierNoeudRouteTraffic;
	

	private ActionEvenement actionEvenement;
	
	public static String getNoeudAccident() {
		return premierNoeudRouteAccident.getText();
	}

	

	/**
	 * @return the premierNoeudRouteAccident
	 */
	public static JTextField getPremierNoeudRouteAccident() {
		return premierNoeudRouteAccident;
	}



	/**
	 * @param premierNoeudRouteAccident the premierNoeudRouteAccident to set
	 */
	public static void setPremierNoeudRouteAccident(JTextField premierNoeudRouteAccident) {
		FrmPanelSimulation.premierNoeudRouteAccident = premierNoeudRouteAccident;
	}



	/**
	 * @return the premierNoeudRouteTraffic
	 */
	public static JTextField getPremierNoeudRouteTraffic() {
		return premierNoeudRouteTraffic;
	}



	/**
	 * @param premierNoeudRouteTraffic the premierNoeudRouteTraffic to set
	 */
	public static void setPremierNoeudRouteTraffic(JTextField premierNoeudRouteTraffic) {
		FrmPanelSimulation.premierNoeudRouteTraffic = premierNoeudRouteTraffic;
	}



	/**
	 * @return the panelUtilisateur
	 */
	public PanelUtilisateur getPanelUtilisateur() {
		return panelUtilisateur;
	}

	/**
	 * @param panelUtilisateur
	 *            the panelUtilisateur to set
	 */
	public void setPanelUtilisateur(PanelUtilisateur panelUtilisateur) {
		this.panelUtilisateur = panelUtilisateur;
	}

	/**
	 * @return the demarrerSimulation
	 */
	public JButton getDemarrerSimulation() {
		return demarrerSimulation;
	}

	/**
	 * @param demarrerSimulation
	 *            the demarrerSimulation to set
	 */
	public void setDemarrerSimulation(JButton demarrerSimulation) {
		this.demarrerSimulation = demarrerSimulation;
	}

	/**
	 * @return the panelsimulation
	 */
	public JPanel getPanelsimulation() {
		return panelSimulation;
	}

	/**
	 * @param panelsimulation
	 *            the panelsimulation to set
	 */
	public void setPanelsimulation(JPanel panelsimulation) {
		this.panelSimulation = panelsimulation;
	}

	/**
	 * @return the genereAccident
	 */
	public JButton getGenereAccident() {
		return genereAccident;
	}

	/**
	 * @param genereAccident
	 *            the genereAccident to set
	 */
	public void setGenereAccident(JButton genereAccident) {
		this.genereAccident = genereAccident;
	}

	/**
	 * @return the genereTraffic
	 */
	public JButton getGenereTraffic() {
		return genereTraffic;
	}

	/**
	 * @param genereTraffic
	 *            the genereTraffic to set
	 */
	public void setGenereTraffic(JButton genereTraffic) {
		this.genereTraffic = genereTraffic;
	}

	/**
	 * @return the routeAccident
	 */
	public JLabel getRouteArriver() {
		return routeArriver;
	}

	/**
	 * @param routeAccident
	 *            the routeAccident to set
	 */
	public void setRouteArriver(JLabel routeArriver) {
		this.routeArriver = routeArriver;
	}

	/**
	 * @return the routeTraffic
	 */
	public static JLabel getRouteDepart() {
		return routeDepart;
	}

	/**
	 * @param routeTraffic
	 *            the routeTraffic to set
	 */
	public void setRouteDepart(JLabel routeDepart) {
		this.routeDepart = routeDepart;
	}

	/**
	 * @return the actionEvenement
	 */
	public ActionEvenement getActionEvenement() {
		return actionEvenement;
	}

	/**
	 * @param actionEvenement
	 *            the actionEvenement to set
	 */
	public void setActionEvenement(ActionEvenement actionEvenement) {
		this.actionEvenement = actionEvenement;
	}
	
	

	/**
	 * @return the infoRouteDepart
	 */
	public static JLabel getInfoRouteDepart() {
		return infoRouteDepart;
	}

	/**
	 * @param infoRouteDepart the infoRouteDepart to set
	 */
	public void setInfoRouteDepart(JLabel infoRouteDepart) {
		FrmPanelSimulation.infoRouteDepart = infoRouteDepart;
	}

	/**
	 * @return the infoRouteArriver
	 */
	public static JLabel getInfoRouteArriver() {
		return infoRouteArriver;
	}

	/**
	 * @param infoRouteArriver the infoRouteArriver to set
	 */
	public void setInfoRouteArriver(JLabel infoRouteArriver) {
		FrmPanelSimulation.infoRouteArriver = infoRouteArriver;
	}

	/**
	 * @return the routeArrSaisi
	 */
	public static JTextField getRouteArrSaisi() {
		return routeArrSaisi;
	}

	/**
	 * @param routeArrSaisi the routeArrSaisi to set
	 */
	public void setRouteArrSaisi(JTextField routeArrSaisi) {
		FrmPanelSimulation.routeArrSaisi = routeArrSaisi;
	}

	/**
	 * @return the routeDepSaisi
	 */
	public static JTextField getRouteDepSaisi() {
		return routeDepSaisi;
	}

	/**
	 * @param routeDepSaisi the routeDepSaisi to set
	 */
	public void setRouteDepSaisi(JTextField routeDepSaisi) {
		FrmPanelSimulation.routeDepSaisi = routeDepSaisi;
	}

	public FrmPanelSimulation(ActionEvenement listener) {
		super(" Simulation ");
		this.actionEvenement = listener;
		fenetreSimulation();
	}

	public void fenetreSimulation() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(950, 250);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		panelSimulation = new JPanel(new GridBagLayout());
		panelSimulation.setBackground(Color.BLACK);
		this.add(panelSimulation);

		/**
		 * Contrainte de mise en forme, elle est utilise pour definir l'emplacement de
		 * composante su le JPanel
		 */
		GridBagConstraints contrainte = new GridBagConstraints();
		/**
		 * Definition de l'espacement entre les composantes
		 */
		contrainte.insets = new Insets(10, 10, 10, 10);

		/**
		 * Redimensionement automatique des composantes
		 */
		contrainte.weightx = 0.5;
		contrainte.weighty = 0.5;
		
		//Dimension des JTextfield
		Dimension inputdim = new Dimension();
		inputdim.setSize(50, 10);

		/**
		 * Composantes de la premiere colonne du GridBagLayout
		 */
		//contrainte.anchor = GridBagConstraints.LINE_START;
		demarrerSimulation = new JButton("Démarrer");
		demarrerSimulation.setFont(new Font("Serif", Font.BOLD, 19));
		demarrerSimulation.setToolTipText("Cliquer pour lancer la navigation");
		demarrerSimulation.addActionListener(actionEvenement);// ajout d'un ecouteur sur le boutton
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.ipadx = 10;
		contrainte.gridx = 0;
		contrainte.gridy = 0;
		panelSimulation.add(demarrerSimulation, contrainte);
		
		routeDepart = new JLabel("Point départ ", JLabel.CENTER);
		routeDepart.setFont(new Font("Serif", Font.BOLD, 19));
		routeDepart.setForeground(Color.GREEN);
		contrainte.anchor = GridBagConstraints.LINE_START;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 1;
		contrainte.gridy = 0;
		panelSimulation.add(routeDepart, contrainte);
		
		genereAccident = new JButton("Generer un accident");
		genereAccident.setFont(new Font("Serif", Font.BOLD, 19));
		genereAccident.setToolTipText("cliquer pour generer un accident");
		genereAccident.addActionListener(actionEvenement);// ajout d'un ecouteur sur le boutton
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 0;
		contrainte.gridy = 2;
		panelSimulation.add(genereAccident, contrainte);

		/**
		 * Composantes de la deuxieme colonne du GridBagLayout
		 */
		infoRouteDepart = new JLabel("Départ ", JLabel.CENTER);
		infoRouteDepart.setFont(new Font("Serif", Font.BOLD, 19));
		infoRouteDepart.setForeground(Color.GREEN);
		infoRouteDepart.setToolTipText("Point de départ");
		contrainte.anchor = GridBagConstraints.LINE_START;
		contrainte.anchor = GridBagConstraints.LINE_END;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 0;
		contrainte.gridy = 1;
		panelSimulation.add(infoRouteDepart, contrainte);
		
		routeDepSaisi = new JTextField(); //Point de départ
		routeDepSaisi.setMinimumSize(inputdim);
		routeDepSaisi.setPreferredSize(inputdim);
		routeDepSaisi.addActionListener(actionEvenement);// ajout d'un ecouteur
		routeDepSaisi.setToolTipText("Entrer l'index du point départ");
		contrainte.anchor = GridBagConstraints.LINE_START;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 1;
		contrainte.gridy = 1;
		panelSimulation.add(routeDepSaisi, contrainte);
		
		premierNoeudRouteAccident = new JTextField("1er Noeud route accidentee");
		premierNoeudRouteAccident.setToolTipText("Entrez le premier noeud du lien (route) accidentée");
		premierNoeudRouteAccident.addActionListener(actionEvenement);// ajout d'un ecouteur
		contrainte.anchor = GridBagConstraints.LINE_START;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 1;
		contrainte.gridy = 2;
		panelSimulation.add(premierNoeudRouteAccident, contrainte);

		/**
		 * Composantes de la troisieme colonne du GridBagLayout
		 */
		
		/**
		 * ajouter une fonction qui genere aleatoirement le traffic
		 */
		genereTraffic = new JButton("Generer un traffic");
		genereTraffic.setEnabled(true);
		genereTraffic.setFont(new Font("Serif", Font.BOLD, 19));
		genereTraffic.setToolTipText("cliquer pour generer un traffic");
		genereTraffic.addActionListener(actionEvenement);// ajout d'un ecouteur sur le boutton
		contrainte.anchor = GridBagConstraints.CENTER;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 2;
		contrainte.gridy = 2;
		panelSimulation.add(genereTraffic, contrainte);
		
		/**
		 * Remplace le jtextfield par deux jlabel, un pour affiche le noeud de depart 
		 * et un autre pour le point d'arriver
		 */
		routeArriver = new JLabel("Arrivé", JLabel.CENTER);
		routeArriver.setFont(new Font("Serif", Font.BOLD, 19));
		routeArriver.setForeground(Color.GREEN);
		contrainte.anchor = GridBagConstraints.LINE_END;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.ipadx = 40;
		contrainte.gridx = 2;
		contrainte.gridy = 1;
		panelSimulation.add(routeArriver, contrainte);
		
		infoRouteArriver = new JLabel("Point d'arrivé ", JLabel.CENTER);
		infoRouteArriver.setFont(new Font("Serif", Font.BOLD, 19));
		infoRouteArriver.setForeground(Color.GREEN);
		infoRouteArriver.setToolTipText("Point d'arrive");
		contrainte.anchor = GridBagConstraints.LINE_START;
		//contrainte.anchor = GridBagConstraints.LINE_END;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 3;
		contrainte.gridy = 0;
		panelSimulation.add(infoRouteArriver, contrainte);

		/**
		 * Composantes de la quatrieme colonne du GridBagLayout
		 */
		routeArrSaisi = new JTextField(); //Point d'arrivé
		routeArrSaisi.setMinimumSize(inputdim);
		routeArrSaisi.setPreferredSize(inputdim);
		routeArrSaisi.setToolTipText("Entrer l'index du point d'arrivé");
		routeArrSaisi.addActionListener(actionEvenement);// ajout d'un ecouteur
		contrainte.anchor = GridBagConstraints.LINE_START;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 3;
		contrainte.gridy = 1;
		panelSimulation.add(routeArrSaisi, contrainte);
		
		premierNoeudRouteTraffic = new JTextField("1er Noeud route qui a un traffic");
		premierNoeudRouteTraffic.setToolTipText("Entrez le premier noeud du lien (route) qui a un traffic");
		premierNoeudRouteTraffic.addActionListener(actionEvenement);// ajout d'un ecouteur
		contrainte.anchor = GridBagConstraints.LINE_START;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		contrainte.fill = GridBagConstraints.VERTICAL;
		contrainte.gridx = 3;
		contrainte.gridy = 2;
		panelSimulation.add(premierNoeudRouteTraffic, contrainte);
	}
}
