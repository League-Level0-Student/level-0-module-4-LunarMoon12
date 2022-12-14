package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Scores {

	public static void main(String args[]) {

		String score = JOptionPane.showInputDialog("Whats's your test score?");
		int int_score = (Integer.parseInt(score));

		if (int_score >= 90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that quiz!");
		} else if (int_score >= 80) {
			JOptionPane.showMessageDialog(null, "You did an awsome job on that quiz! Great work!");
		} else if (int_score >= 70) {
			JOptionPane.showMessageDialog(null, "You worked really hard on that quiz!");
		} else if (int_score >= 60) {
			JOptionPane.showMessageDialog(null, "Great job! You did great.");
		} else if (int_score >= 50) {
			JOptionPane.showMessageDialog(null, "Nice! You passed the quiz.");
		} else if (int_score >= 40) {
			JOptionPane.showMessageDialog(null, "It must have been a hard quiz, try again next time.");
		} else if (int_score >= 30) {
			JOptionPane.showMessageDialog(null, "You need to work on some concepts.");
		} else if (int_score >= 20) {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		} else {
		JOptionPane.showMessageDialog(null, "Maybe next time you'll get a higher score.");
		}
	}
}