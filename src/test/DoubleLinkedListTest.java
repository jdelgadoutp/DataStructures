package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.lists.DoubleLinkedList;
import cap2.lists.LinkedList;
import utils.Mp3;

class DoubleLinkedListTest {

	@Test
	void testInsertOrdenByNumberTra() {

		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());

		String author1 = "Aerosmith";
		String file1 = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name1 = "Amazing";
		String trackNo1 = "006";

		myList.add(author1, file1, name1, trackNo1);
		assertEquals(2, myList.getSize());

		// Query to database
		Mp3 cancion1 = myList.getTail().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author1, cancion1.getAuthor());
		assertEquals(file1, cancion1.getFile());
		assertEquals(name1, cancion1.getName());
		assertEquals(trackNo1, cancion1.getTrackNo());

		String author2 = "Aerosmith";
		String file2 = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name2 = "Amazing";
		String trackNo2 = "005";

		myList.add(author2, file2, name2, trackNo2);
		assertEquals(3, myList.getSize());

		// Query to database
		Mp3 cancion2 = myList.getCursor().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author2, cancion2.getAuthor());
		assertEquals(file2, cancion2.getFile());
		assertEquals(name2, cancion2.getName());
		assertEquals(trackNo2, cancion2.getTrackNo());

	}

	@Test
	void tesListDoubleLinked() {

		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());

		String author1 = "Aerosmith";
		String file1 = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name1 = "Amazing";
		String trackNo1 = "006";

		myList.add(author1, file1, name1, trackNo1);
		assertEquals(2, myList.getSize());

		// Query to database
		Mp3 cancion1 = myList.getTail().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author1, cancion1.getAuthor());
		assertEquals(file1, cancion1.getFile());
		assertEquals(name1, cancion1.getName());
		assertEquals(trackNo1, cancion1.getTrackNo());

		String author2 = "Aerosmith";
		String file2 = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name2 = "Amazing";
		String trackNo2 = "005";

		myList.add(author2, file2, name2, trackNo2);
		assertEquals(3, myList.getSize());

		// Query to database
		Mp3 cancion2 = myList.getCursor().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author2, cancion2.getAuthor());
		assertEquals(file2, cancion2.getFile());
		assertEquals(name2, cancion2.getName());
		assertEquals(trackNo2, cancion2.getTrackNo());

		myList.list();
	}

	@Test
	void testDeleteTrackNo() {

		// Creating the data structure
		DoubleLinkedList myList = new DoubleLinkedList();
		assertEquals(0, myList.getSize());
		Boolean expectedvalue = true;
		Boolean actualvalue = null;

		// Expected values

		String author = "Aerosmith";
		String file = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name = "Amazing";
		String trackNo = "004";

		myList.add(author, file, name, trackNo);
		assertEquals(1, myList.getSize());

		// Query to database
		Mp3 cancion = myList.getHead().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author, cancion.getAuthor());
		assertEquals(file, cancion.getFile());
		assertEquals(name, cancion.getName());
		assertEquals(trackNo, cancion.getTrackNo());

		String author1 = "Aerosmith";
		String file1 = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name1 = "Amazing";
		String trackNo1 = "006";

		myList.add(author1, file1, name1, trackNo1);
		assertEquals(2, myList.getSize());

		// Query to database
		Mp3 cancion1 = myList.getTail().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author1, cancion1.getAuthor());
		assertEquals(file1, cancion1.getFile());
		assertEquals(name1, cancion1.getName());
		assertEquals(trackNo1, cancion1.getTrackNo());

		String author2 = "Aerosmith";
		String file2 = "jjfdsklf3424432kdkjsflkjsgf##@#";
		String name2 = "Amazing";
		String trackNo2 = "005";

		myList.add(author2, file2, name2, trackNo2);
		assertEquals(3, myList.getSize());

		// Query to database
		Mp3 cancion2 = myList.getCursor().getDato();

		// aSSERTING THE INFORMATION
		assertEquals(author2, cancion2.getAuthor());
		assertEquals(file2, cancion2.getFile());
		assertEquals(name2, cancion2.getName());
		assertEquals(trackNo2, cancion2.getTrackNo());

		actualvalue = myList.DeleteTrackNo("005");
		myList.list();
		assertEquals(2, myList.getSize());
		assertEquals(expectedvalue, actualvalue);

	}

}
