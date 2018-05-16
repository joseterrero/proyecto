package com.salesianostriana.proyectofinal.formbean;

public class LoginUser {

		private String usuario;
		private String contrasenya;

		public LoginUser() {
			super();
		}

		public LoginUser(String usuario, String contrasenya) {
			this.usuario = usuario;
			this.contrasenya = contrasenya;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getContrasenya() {
			return contrasenya;
		}

		public void setContrasenya(String contrasenya) {
			this.contrasenya = contrasenya;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((contrasenya == null) ? 0 : contrasenya.hashCode());
			result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LoginUser other = (LoginUser) obj;
			if (contrasenya == null) {
				if (other.contrasenya != null)
					return false;
			} else if (!contrasenya.equals(other.contrasenya))
				return false;
			if (usuario == null) {
				if (other.usuario != null)
					return false;
			} else if (!usuario.equals(other.usuario))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "LoginUser [usuario=" + usuario + ", contrasenya=" + contrasenya + "]";
		}

}
