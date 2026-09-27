public class LibroTexto extends Libro {

private String curso;

public LibroTexto(String titulo,
String autor,
int ejemplares,
int prestados,
String curso) {

super(titulo, autor,
ejemplares, prestados);

this.curso = curso;
}

public String getCurso() {
return curso;
}

public void setCurso(String curso) {
this.curso = curso;
}

@Override
public String toString() {

return super.toString() +
"\nCurso: " + curso;
}
}