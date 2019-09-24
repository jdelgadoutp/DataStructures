package cap2.lists;

import javax.swing.event.TreeWillExpandListener;

public class PriorityQueve {

	private QueveWorkPrint[] spoolprinters;

	public QueveWorkPrint[] getSpoolprinters() {
		return spoolprinters;
	}

	public void setSpoolprinters(QueveWorkPrint[] spoolprinters) {
		this.spoolprinters = spoolprinters;
	}

	public PriorityQueve(QueveWorkPrint[] spoolprinters) {
		this.spoolprinters = new QueveWorkPrint[5];
	}

	public QueveWorkPrint[] ClassifyandEnqueve(String name, String state, String proprietor, String port, int pages,
			float size, String send) {

		int i = 0;

		if (size > 0 && size <= 10) {
			i = 0;
		}

		if (size > 10 && size <= 20) {
			i = 1;
		}

		if (size > 20 && size <= 30) {
			i = 2;
		}

		if (size > 30 && size <= 40) {
			i = 3;
		}

		if (size > 40 && size <= 50) {
			i = 4;
		}

		if (i >= 0 && i < 5) {
			QueveWorkPrint newQueve = new QueveWorkPrint();
			QueveWorkPrint quevetemp = new QueveWorkPrint();
			newQueve.Enqueve(name, state, proprietor, port, pages, size, send);
			quevetemp = this.spoolprinters[i];

			if (quevetemp != null) {
				quevetemp.getLast().setNext(newQueve.getLast());
				quevetemp.setLast(newQueve.getLast());
				this.spoolprinters[i] = quevetemp;
			} else {

				this.spoolprinters[i] = newQueve;
			}
			this.spoolprinters[i].setSize(this.spoolprinters[i].getSize() + 1);
		}
		return this.spoolprinters;

	}

	public void PriorityQueveList() {
		QueveWorkPrint[] mylist = this.spoolprinters;
		System.out.println("-------------- Print QueveWorkPrint -------------------");
		for (int i = 0; i < mylist.length; i++) {
			mylist[i].ListQueve();
		}
	}

	public void DeQueve() {

		for (int i = 0; i < this.spoolprinters.length; i++) {
			try {
				while (this.spoolprinters[i].getSize() > 0) {
					this.spoolprinters[i].Dequeve();
					Thread.sleep(1000);
					PriorityQueveList();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
