package co.edu.unbosque.ciclo4back.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
	@Column(name = "cedula_usuario")
	private long cedulaUsuario;
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	@Column(name = "email_usuario")
	private String emailUsuario;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "password")
	private String password;
	@Column(name = "ciudad")
	private String ciudad;
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public long getCedulaUsuario() {
		return cedulaUsuario;
	}
	public void setCedulaUsuario(long cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
