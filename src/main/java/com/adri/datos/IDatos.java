package com.adri.datos;

import java.io.IOException;
import java.util.List;

public interface IDatos {

	List<String> consultaLista() throws IOException;

}