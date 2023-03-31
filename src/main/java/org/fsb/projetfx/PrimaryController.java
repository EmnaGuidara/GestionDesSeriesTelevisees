package org.fsb.projetfx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
 	private void hello() {
 		System.out.println("hello world");
		
	}}
