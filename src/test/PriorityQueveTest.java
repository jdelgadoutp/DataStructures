package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.lists.PriorityQueve;
import cap2.lists.QueveWorkPrint;

class PriorityQueveTest {

	@Test
	void ClassifyandEnquevePriorityQueve() {

		// Clasifico y encolo en la posucion 0 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint.getSize());

		myQueveWorkPrint.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 9, "25-10-2018");
		QueveWorkPrint[] expectedvalue = new QueveWorkPrint[5];
		QueveWorkPrint[] actualvalue = new QueveWorkPrint[5];
		expectedvalue[0] = myQueveWorkPrint;

		PriorityQueve MyPriorityQueve = new PriorityQueve(null);
		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 9, "25-10-2018");
		assertEquals(expectedvalue[0].getLast().getDocument().getName(), actualvalue[0].getLast().getDocument().getName());
		assertEquals(expectedvalue[0].getLast().getDocument().getState(), actualvalue[0].getLast().getDocument().getState());
		assertEquals(expectedvalue[0].getLast().getDocument().getProprietor(), actualvalue[0].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[0].getLast().getDocument().getPort(), actualvalue[0].getLast().getDocument().getPort());
		assertEquals(expectedvalue[0].getLast().getDocument().getPages(), actualvalue[0].getLast().getDocument().getPages());
		assertEquals(expectedvalue[0].getLast().getDocument().getSize(), actualvalue[0].getLast().getDocument().getSize());
		assertEquals(expectedvalue[0].getLast().getDocument().getSend(), actualvalue[0].getLast().getDocument().getSend());
		
		myQueveWorkPrint.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 4, "25-10-2018");
		expectedvalue[0] = myQueveWorkPrint;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 4, "25-10-2018");
		assertEquals(expectedvalue[0].getLast().getDocument().getName(), actualvalue[0].getLast().getDocument().getName());
		assertEquals(expectedvalue[0].getLast().getDocument().getState(), actualvalue[0].getLast().getDocument().getState());
		assertEquals(expectedvalue[0].getLast().getDocument().getProprietor(), actualvalue[0].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[0].getLast().getDocument().getPort(), actualvalue[0].getLast().getDocument().getPort());
		assertEquals(expectedvalue[0].getLast().getDocument().getPages(), actualvalue[0].getLast().getDocument().getPages());
		assertEquals(expectedvalue[0].getLast().getDocument().getSize(), actualvalue[0].getLast().getDocument().getSize());
		assertEquals(expectedvalue[0].getLast().getDocument().getSend(), actualvalue[0].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 1 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint1 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint1.getSize());

		myQueveWorkPrint1.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 15, "25-10-2018");
		expectedvalue[1] = myQueveWorkPrint1;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 15, "25-10-2018");
		assertEquals(expectedvalue[1].getLast().getDocument().getName(), actualvalue[1].getLast().getDocument().getName());
		assertEquals(expectedvalue[1].getLast().getDocument().getState(), actualvalue[1].getLast().getDocument().getState());
		assertEquals(expectedvalue[1].getLast().getDocument().getProprietor(), actualvalue[1].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[1].getLast().getDocument().getPort(), actualvalue[1].getLast().getDocument().getPort());
		assertEquals(expectedvalue[1].getLast().getDocument().getPages(), actualvalue[1].getLast().getDocument().getPages());
		assertEquals(expectedvalue[1].getLast().getDocument().getSize(), actualvalue[1].getLast().getDocument().getSize());
		assertEquals(expectedvalue[1].getLast().getDocument().getSend(), actualvalue[1].getLast().getDocument().getSend());
		
		myQueveWorkPrint1.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 18, "25-10-2018");
		expectedvalue[1] = myQueveWorkPrint1;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 18, "25-10-2018");
		assertEquals(expectedvalue[1].getLast().getDocument().getName(), actualvalue[1].getLast().getDocument().getName());
		assertEquals(expectedvalue[1].getLast().getDocument().getState(), actualvalue[1].getLast().getDocument().getState());
		assertEquals(expectedvalue[1].getLast().getDocument().getProprietor(), actualvalue[1].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[1].getLast().getDocument().getPort(), actualvalue[1].getLast().getDocument().getPort());
		assertEquals(expectedvalue[1].getLast().getDocument().getPages(), actualvalue[1].getLast().getDocument().getPages());
		assertEquals(expectedvalue[1].getLast().getDocument().getSize(), actualvalue[1].getLast().getDocument().getSize());
		assertEquals(expectedvalue[1].getLast().getDocument().getSend(), actualvalue[1].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 2 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint2 = new QueveWorkPrint();
		
		myQueveWorkPrint2.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 25, "25-10-2018");
		expectedvalue[2] = myQueveWorkPrint2;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 25, "25-10-2018");
		assertEquals(expectedvalue[2].getLast().getDocument().getName(), actualvalue[2].getLast().getDocument().getName());
		assertEquals(expectedvalue[2].getLast().getDocument().getState(), actualvalue[2].getLast().getDocument().getState());
		assertEquals(expectedvalue[2].getLast().getDocument().getProprietor(), actualvalue[2].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[2].getLast().getDocument().getPort(), actualvalue[2].getLast().getDocument().getPort());
		assertEquals(expectedvalue[2].getLast().getDocument().getPages(), actualvalue[2].getLast().getDocument().getPages());
		assertEquals(expectedvalue[2].getLast().getDocument().getSize(), actualvalue[2].getLast().getDocument().getSize());
		assertEquals(expectedvalue[2].getLast().getDocument().getSend(), actualvalue[2].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 3 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint3 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint3.getSize());

		myQueveWorkPrint3.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 32, "25-10-2018");
		expectedvalue[3] = myQueveWorkPrint3;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 32, "25-10-2018");
		assertEquals(expectedvalue[3].getLast().getDocument().getName(), actualvalue[3].getLast().getDocument().getName());
		assertEquals(expectedvalue[3].getLast().getDocument().getState(), actualvalue[3].getLast().getDocument().getState());
		assertEquals(expectedvalue[3].getLast().getDocument().getProprietor(), actualvalue[3].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[3].getLast().getDocument().getPort(), actualvalue[3].getLast().getDocument().getPort());
		assertEquals(expectedvalue[3].getLast().getDocument().getPages(), actualvalue[3].getLast().getDocument().getPages());
		assertEquals(expectedvalue[3].getLast().getDocument().getSize(), actualvalue[3].getLast().getDocument().getSize());
		assertEquals(expectedvalue[3].getLast().getDocument().getSend(), actualvalue[3].getLast().getDocument().getSend());
						
		myQueveWorkPrint3.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 35, "25-10-2018");
		expectedvalue[3] = myQueveWorkPrint3;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 35, "25-10-2018");
		assertEquals(expectedvalue[3].getLast().getDocument().getName(), actualvalue[3].getLast().getDocument().getName());
		assertEquals(expectedvalue[3].getLast().getDocument().getState(), actualvalue[3].getLast().getDocument().getState());
		assertEquals(expectedvalue[3].getLast().getDocument().getProprietor(), actualvalue[3].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[3].getLast().getDocument().getPort(), actualvalue[3].getLast().getDocument().getPort());
		assertEquals(expectedvalue[3].getLast().getDocument().getPages(), actualvalue[3].getLast().getDocument().getPages());
		assertEquals(expectedvalue[3].getLast().getDocument().getSize(), actualvalue[3].getLast().getDocument().getSize());
		assertEquals(expectedvalue[3].getLast().getDocument().getSend(), actualvalue[3].getLast().getDocument().getSend());				
		
		
		// Clasifico y encolo en la posucion 4 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint4 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint4.getSize());

		myQueveWorkPrint4.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 42, "25-10-2018");
		expectedvalue[4] = myQueveWorkPrint4;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 42, "25-10-2018");
		assertEquals(expectedvalue[4].getLast().getDocument().getName(), actualvalue[4].getLast().getDocument().getName());
		assertEquals(expectedvalue[4].getLast().getDocument().getState(), actualvalue[4].getLast().getDocument().getState());
		assertEquals(expectedvalue[4].getLast().getDocument().getProprietor(), actualvalue[4].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[4].getLast().getDocument().getPort(), actualvalue[4].getLast().getDocument().getPort());
		assertEquals(expectedvalue[4].getLast().getDocument().getPages(), actualvalue[4].getLast().getDocument().getPages());
		assertEquals(expectedvalue[4].getLast().getDocument().getSize(), actualvalue[4].getLast().getDocument().getSize());
		assertEquals(expectedvalue[4].getLast().getDocument().getSend(), actualvalue[4].getLast().getDocument().getSend());
				
	}
	
	@Test
	void PriorityQueveList() {

		// Clasifico y encolo en la posucion 0 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint.getSize());

		myQueveWorkPrint.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 9, "25-10-2018");
		QueveWorkPrint[] expectedvalue = new QueveWorkPrint[5];
		QueveWorkPrint[] actualvalue = new QueveWorkPrint[5];
		expectedvalue[0] = myQueveWorkPrint;

		PriorityQueve MyPriorityQueve = new PriorityQueve(null);
		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 9, "25-10-2018");
		assertEquals(expectedvalue[0].getLast().getDocument().getName(), actualvalue[0].getLast().getDocument().getName());
		assertEquals(expectedvalue[0].getLast().getDocument().getState(), actualvalue[0].getLast().getDocument().getState());
		assertEquals(expectedvalue[0].getLast().getDocument().getProprietor(), actualvalue[0].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[0].getLast().getDocument().getPort(), actualvalue[0].getLast().getDocument().getPort());
		assertEquals(expectedvalue[0].getLast().getDocument().getPages(), actualvalue[0].getLast().getDocument().getPages());
		assertEquals(expectedvalue[0].getLast().getDocument().getSize(), actualvalue[0].getLast().getDocument().getSize());
		assertEquals(expectedvalue[0].getLast().getDocument().getSend(), actualvalue[0].getLast().getDocument().getSend());
		
		myQueveWorkPrint.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 4, "25-10-2018");
		expectedvalue[0] = myQueveWorkPrint;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 4, "25-10-2018");
		assertEquals(expectedvalue[0].getLast().getDocument().getName(), actualvalue[0].getLast().getDocument().getName());
		assertEquals(expectedvalue[0].getLast().getDocument().getState(), actualvalue[0].getLast().getDocument().getState());
		assertEquals(expectedvalue[0].getLast().getDocument().getProprietor(), actualvalue[0].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[0].getLast().getDocument().getPort(), actualvalue[0].getLast().getDocument().getPort());
		assertEquals(expectedvalue[0].getLast().getDocument().getPages(), actualvalue[0].getLast().getDocument().getPages());
		assertEquals(expectedvalue[0].getLast().getDocument().getSize(), actualvalue[0].getLast().getDocument().getSize());
		assertEquals(expectedvalue[0].getLast().getDocument().getSend(), actualvalue[0].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 1 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint1 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint1.getSize());

		myQueveWorkPrint1.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 15, "25-10-2018");
		expectedvalue[1] = myQueveWorkPrint1;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 15, "25-10-2018");
		assertEquals(expectedvalue[1].getLast().getDocument().getName(), actualvalue[1].getLast().getDocument().getName());
		assertEquals(expectedvalue[1].getLast().getDocument().getState(), actualvalue[1].getLast().getDocument().getState());
		assertEquals(expectedvalue[1].getLast().getDocument().getProprietor(), actualvalue[1].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[1].getLast().getDocument().getPort(), actualvalue[1].getLast().getDocument().getPort());
		assertEquals(expectedvalue[1].getLast().getDocument().getPages(), actualvalue[1].getLast().getDocument().getPages());
		assertEquals(expectedvalue[1].getLast().getDocument().getSize(), actualvalue[1].getLast().getDocument().getSize());
		assertEquals(expectedvalue[1].getLast().getDocument().getSend(), actualvalue[1].getLast().getDocument().getSend());
		
		myQueveWorkPrint1.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 18, "25-10-2018");
		expectedvalue[1] = myQueveWorkPrint1;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 18, "25-10-2018");
		assertEquals(expectedvalue[1].getLast().getDocument().getName(), actualvalue[1].getLast().getDocument().getName());
		assertEquals(expectedvalue[1].getLast().getDocument().getState(), actualvalue[1].getLast().getDocument().getState());
		assertEquals(expectedvalue[1].getLast().getDocument().getProprietor(), actualvalue[1].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[1].getLast().getDocument().getPort(), actualvalue[1].getLast().getDocument().getPort());
		assertEquals(expectedvalue[1].getLast().getDocument().getPages(), actualvalue[1].getLast().getDocument().getPages());
		assertEquals(expectedvalue[1].getLast().getDocument().getSize(), actualvalue[1].getLast().getDocument().getSize());
		assertEquals(expectedvalue[1].getLast().getDocument().getSend(), actualvalue[1].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 2 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint2 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint2.getSize());

		myQueveWorkPrint2.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 25, "25-10-2018");
		expectedvalue[2] = myQueveWorkPrint2;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 25, "25-10-2018");
		assertEquals(expectedvalue[2].getLast().getDocument().getName(), actualvalue[2].getLast().getDocument().getName());
		assertEquals(expectedvalue[2].getLast().getDocument().getState(), actualvalue[2].getLast().getDocument().getState());
		assertEquals(expectedvalue[2].getLast().getDocument().getProprietor(), actualvalue[2].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[2].getLast().getDocument().getPort(), actualvalue[2].getLast().getDocument().getPort());
		assertEquals(expectedvalue[2].getLast().getDocument().getPages(), actualvalue[2].getLast().getDocument().getPages());
		assertEquals(expectedvalue[2].getLast().getDocument().getSize(), actualvalue[2].getLast().getDocument().getSize());
		assertEquals(expectedvalue[2].getLast().getDocument().getSend(), actualvalue[2].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 3 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint3 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint3.getSize());

		myQueveWorkPrint3.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 32, "25-10-2018");
		expectedvalue[3] = myQueveWorkPrint3;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 32, "25-10-2018");
		assertEquals(expectedvalue[3].getLast().getDocument().getName(), actualvalue[3].getLast().getDocument().getName());
		assertEquals(expectedvalue[3].getLast().getDocument().getState(), actualvalue[3].getLast().getDocument().getState());
		assertEquals(expectedvalue[3].getLast().getDocument().getProprietor(), actualvalue[3].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[3].getLast().getDocument().getPort(), actualvalue[3].getLast().getDocument().getPort());
		assertEquals(expectedvalue[3].getLast().getDocument().getPages(), actualvalue[3].getLast().getDocument().getPages());
		assertEquals(expectedvalue[3].getLast().getDocument().getSize(), actualvalue[3].getLast().getDocument().getSize());
		assertEquals(expectedvalue[3].getLast().getDocument().getSend(), actualvalue[3].getLast().getDocument().getSend());
						
		myQueveWorkPrint3.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 35, "25-10-2018");
		expectedvalue[3] = myQueveWorkPrint3;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 35, "25-10-2018");
		assertEquals(expectedvalue[3].getLast().getDocument().getName(), actualvalue[3].getLast().getDocument().getName());
		assertEquals(expectedvalue[3].getLast().getDocument().getState(), actualvalue[3].getLast().getDocument().getState());
		assertEquals(expectedvalue[3].getLast().getDocument().getProprietor(), actualvalue[3].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[3].getLast().getDocument().getPort(), actualvalue[3].getLast().getDocument().getPort());
		assertEquals(expectedvalue[3].getLast().getDocument().getPages(), actualvalue[3].getLast().getDocument().getPages());
		assertEquals(expectedvalue[3].getLast().getDocument().getSize(), actualvalue[3].getLast().getDocument().getSize());
		assertEquals(expectedvalue[3].getLast().getDocument().getSend(), actualvalue[3].getLast().getDocument().getSend());				
		
		
		// Clasifico y encolo en la posucion 4 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint4 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint4.getSize());

		myQueveWorkPrint4.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 42, "25-10-2018");
		expectedvalue[4] = myQueveWorkPrint4;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 42, "25-10-2018");
		assertEquals(expectedvalue[4].getLast().getDocument().getName(), actualvalue[4].getLast().getDocument().getName());
		assertEquals(expectedvalue[4].getLast().getDocument().getState(), actualvalue[4].getLast().getDocument().getState());
		assertEquals(expectedvalue[4].getLast().getDocument().getProprietor(), actualvalue[4].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[4].getLast().getDocument().getPort(), actualvalue[4].getLast().getDocument().getPort());
		assertEquals(expectedvalue[4].getLast().getDocument().getPages(), actualvalue[4].getLast().getDocument().getPages());
		assertEquals(expectedvalue[4].getLast().getDocument().getSize(), actualvalue[4].getLast().getDocument().getSize());
		assertEquals(expectedvalue[4].getLast().getDocument().getSend(), actualvalue[4].getLast().getDocument().getSend());
		
		MyPriorityQueve.PriorityQueveList();
		
	}
	
	@Test
	void PriorityDeQueve() {

		// Clasifico y encolo en la posucion 0 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint.getSize());

		myQueveWorkPrint.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 9, "25-10-2018");
		QueveWorkPrint[] expectedvalue = new QueveWorkPrint[5];
		QueveWorkPrint[] actualvalue = new QueveWorkPrint[5];
		expectedvalue[0] = myQueveWorkPrint;

		PriorityQueve MyPriorityQueve = new PriorityQueve(null);
		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 9, "25-10-2018");
		assertEquals(expectedvalue[0].getLast().getDocument().getName(), actualvalue[0].getLast().getDocument().getName());
		assertEquals(expectedvalue[0].getLast().getDocument().getState(), actualvalue[0].getLast().getDocument().getState());
		assertEquals(expectedvalue[0].getLast().getDocument().getProprietor(), actualvalue[0].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[0].getLast().getDocument().getPort(), actualvalue[0].getLast().getDocument().getPort());
		assertEquals(expectedvalue[0].getLast().getDocument().getPages(), actualvalue[0].getLast().getDocument().getPages());
		assertEquals(expectedvalue[0].getLast().getDocument().getSize(), actualvalue[0].getLast().getDocument().getSize());
		assertEquals(expectedvalue[0].getLast().getDocument().getSend(), actualvalue[0].getLast().getDocument().getSend());
		
		myQueveWorkPrint.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 4, "25-10-2018");
		expectedvalue[0] = myQueveWorkPrint;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 4, "25-10-2018");
		assertEquals(expectedvalue[0].getLast().getDocument().getName(), actualvalue[0].getLast().getDocument().getName());
		assertEquals(expectedvalue[0].getLast().getDocument().getState(), actualvalue[0].getLast().getDocument().getState());
		assertEquals(expectedvalue[0].getLast().getDocument().getProprietor(), actualvalue[0].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[0].getLast().getDocument().getPort(), actualvalue[0].getLast().getDocument().getPort());
		assertEquals(expectedvalue[0].getLast().getDocument().getPages(), actualvalue[0].getLast().getDocument().getPages());
		assertEquals(expectedvalue[0].getLast().getDocument().getSize(), actualvalue[0].getLast().getDocument().getSize());
		assertEquals(expectedvalue[0].getLast().getDocument().getSend(), actualvalue[0].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 1 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint1 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint1.getSize());

		myQueveWorkPrint1.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 15, "25-10-2018");
		expectedvalue[1] = myQueveWorkPrint1;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 15, "25-10-2018");
		assertEquals(expectedvalue[1].getLast().getDocument().getName(), actualvalue[1].getLast().getDocument().getName());
		assertEquals(expectedvalue[1].getLast().getDocument().getState(), actualvalue[1].getLast().getDocument().getState());
		assertEquals(expectedvalue[1].getLast().getDocument().getProprietor(), actualvalue[1].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[1].getLast().getDocument().getPort(), actualvalue[1].getLast().getDocument().getPort());
		assertEquals(expectedvalue[1].getLast().getDocument().getPages(), actualvalue[1].getLast().getDocument().getPages());
		assertEquals(expectedvalue[1].getLast().getDocument().getSize(), actualvalue[1].getLast().getDocument().getSize());
		assertEquals(expectedvalue[1].getLast().getDocument().getSend(), actualvalue[1].getLast().getDocument().getSend());
		
		myQueveWorkPrint1.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 18, "25-10-2018");
		expectedvalue[1] = myQueveWorkPrint1;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 18, "25-10-2018");
		assertEquals(expectedvalue[1].getLast().getDocument().getName(), actualvalue[1].getLast().getDocument().getName());
		assertEquals(expectedvalue[1].getLast().getDocument().getState(), actualvalue[1].getLast().getDocument().getState());
		assertEquals(expectedvalue[1].getLast().getDocument().getProprietor(), actualvalue[1].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[1].getLast().getDocument().getPort(), actualvalue[1].getLast().getDocument().getPort());
		assertEquals(expectedvalue[1].getLast().getDocument().getPages(), actualvalue[1].getLast().getDocument().getPages());
		assertEquals(expectedvalue[1].getLast().getDocument().getSize(), actualvalue[1].getLast().getDocument().getSize());
		assertEquals(expectedvalue[1].getLast().getDocument().getSend(), actualvalue[1].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 2 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint2 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint2.getSize());

		myQueveWorkPrint2.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 25, "25-10-2018");
		expectedvalue[2] = myQueveWorkPrint2;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 25, "25-10-2018");
		assertEquals(expectedvalue[2].getLast().getDocument().getName(), actualvalue[2].getLast().getDocument().getName());
		assertEquals(expectedvalue[2].getLast().getDocument().getState(), actualvalue[2].getLast().getDocument().getState());
		assertEquals(expectedvalue[2].getLast().getDocument().getProprietor(), actualvalue[2].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[2].getLast().getDocument().getPort(), actualvalue[2].getLast().getDocument().getPort());
		assertEquals(expectedvalue[2].getLast().getDocument().getPages(), actualvalue[2].getLast().getDocument().getPages());
		assertEquals(expectedvalue[2].getLast().getDocument().getSize(), actualvalue[2].getLast().getDocument().getSize());
		assertEquals(expectedvalue[2].getLast().getDocument().getSend(), actualvalue[2].getLast().getDocument().getSend());
		
		// Clasifico y encolo en la posucion 3 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint3 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint3.getSize());

		myQueveWorkPrint3.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 32, "25-10-2018");
		expectedvalue[3] = myQueveWorkPrint3;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 32, "25-10-2018");
		assertEquals(expectedvalue[3].getLast().getDocument().getName(), actualvalue[3].getLast().getDocument().getName());
		assertEquals(expectedvalue[3].getLast().getDocument().getState(), actualvalue[3].getLast().getDocument().getState());
		assertEquals(expectedvalue[3].getLast().getDocument().getProprietor(), actualvalue[3].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[3].getLast().getDocument().getPort(), actualvalue[3].getLast().getDocument().getPort());
		assertEquals(expectedvalue[3].getLast().getDocument().getPages(), actualvalue[3].getLast().getDocument().getPages());
		assertEquals(expectedvalue[3].getLast().getDocument().getSize(), actualvalue[3].getLast().getDocument().getSize());
		assertEquals(expectedvalue[3].getLast().getDocument().getSend(), actualvalue[3].getLast().getDocument().getSend());
						
		myQueveWorkPrint3.Enqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 35, "25-10-2018");
		expectedvalue[3] = myQueveWorkPrint3;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Presupuesto contable.pdf", "Enviado", "JairoDelgado", "USB001", 3, 35, "25-10-2018");
		assertEquals(expectedvalue[3].getLast().getDocument().getName(), actualvalue[3].getLast().getDocument().getName());
		assertEquals(expectedvalue[3].getLast().getDocument().getState(), actualvalue[3].getLast().getDocument().getState());
		assertEquals(expectedvalue[3].getLast().getDocument().getProprietor(), actualvalue[3].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[3].getLast().getDocument().getPort(), actualvalue[3].getLast().getDocument().getPort());
		assertEquals(expectedvalue[3].getLast().getDocument().getPages(), actualvalue[3].getLast().getDocument().getPages());
		assertEquals(expectedvalue[3].getLast().getDocument().getSize(), actualvalue[3].getLast().getDocument().getSize());
		assertEquals(expectedvalue[3].getLast().getDocument().getSend(), actualvalue[3].getLast().getDocument().getSend());				
		
		
		// Clasifico y encolo en la posucion 4 del vector tipo QueveWorkPrint
		
		QueveWorkPrint myQueveWorkPrint4 = new QueveWorkPrint();
		assertEquals(0, myQueveWorkPrint4.getSize());

		myQueveWorkPrint4.Enqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 42, "25-10-2018");
		expectedvalue[4] = myQueveWorkPrint4;

		actualvalue = MyPriorityQueve.ClassifyandEnqueve("Nomina personal.xls", "Enviado", "JairoDelgado", "USB001", 3, 42, "25-10-2018");
		assertEquals(expectedvalue[4].getLast().getDocument().getName(), actualvalue[4].getLast().getDocument().getName());
		assertEquals(expectedvalue[4].getLast().getDocument().getState(), actualvalue[4].getLast().getDocument().getState());
		assertEquals(expectedvalue[4].getLast().getDocument().getProprietor(), actualvalue[4].getLast().getDocument().getProprietor());
		assertEquals(expectedvalue[4].getLast().getDocument().getPort(), actualvalue[4].getLast().getDocument().getPort());
		assertEquals(expectedvalue[4].getLast().getDocument().getPages(), actualvalue[4].getLast().getDocument().getPages());
		assertEquals(expectedvalue[4].getLast().getDocument().getSize(), actualvalue[4].getLast().getDocument().getSize());
		assertEquals(expectedvalue[4].getLast().getDocument().getSend(), actualvalue[4].getLast().getDocument().getSend());
		
		System.out.println("");
		System.out.println("");
		System.out.println("-------------- Dequeve PriorityQueve SpoolPrinters -------------------");
		System.out.println("");
		System.out.println("");
				
		MyPriorityQueve.DeQueve();
	}
}
