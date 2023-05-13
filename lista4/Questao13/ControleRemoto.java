package Questao13;

public class ControleRemoto {

		private int Volume;
		private int Canais;
		private boolean OnOff;
		
		public ControleRemoto (int volume, int canal, boolean tvLigada) {
			this.Canais = 1;
			this.OnOff = false;
			this.Volume = 0;
			
		}
		public void OnouOff(){
			
			this.OnOff = !this.OnOff;
			 
			if(this.OnOff) {
				System.out.println("Tv ligada\n");
			}
			else {
				System.out.println("Tv desligada\n");
			}
		}
		
		public void aumentarVolume() {
			if(this.OnOff && this.Volume < 100) {
				this.Volume++;
				System.out.println("Volume: "+ this.Volume+"\n");
			}
			else {
				
		        System.out.println("A TV está desligada\n");
		    }
			
		}
		


		
		public void diminuirVolume() {
			if(this.OnOff && this.Volume > 0) {
				this.Volume--;
				System.out.println("Volume: "+ this.Volume+"\n");
			}
			else {
				
		        System.out.println("A TV está desligada\n");
		    }
		}
		
		public void aumentarCanal() {
			if(this.OnOff && this.Canais <= 999) {
				this.Canais++;
				System.out.println("Canal: "+ this.Canais+"\n");
			}
			else {
				
		        System.out.println("A TV está desligada\n");
		    }
		}
		
		public void diminuirCanal() {
			if(this.OnOff && this.Canais > 1) {
				this.Canais--;
				System.out.println("Canal: "+ this.Canais+"\n");
			}
			else {
				
		        System.out.println("A TV está desligada\n");
		    }
		}
		
		public void trocarCanal (int novoCanal) {
			
			if(this.OnOff && this.Canais <= 999) {
				this.Canais = novoCanal;
				System.out.println("Canal: "+ this.Canais+"\n");
			}
			else {
				
		        System.out.println("A TV está desligada\n");
		    }
			
		}
		
		
		public void clicarMudar (int canal) {
			
			if(this.OnOff && this.Canais >= 1 && canal < 999) {
				this.Canais = canal;
				System.out.println("Canal: "+ this.Canais+"\n");
			}
			else {
				
		        System.out.println("A TV está desligada\n");
		    }
		}
		
		public void Televisão(){
			
			 if (this.OnOff) {
		            System.out.println("Volume: " + this.Volume+"\n");
		            System.out.println("Canal: " + this.Canais+"\n");
		        } else {
		            System.out.println("A TV está desligada\n");
		        }
			
		}
		
		public void Mutar () {
			if(this.OnOff) {
				this.Volume = 0;
				System.out.println("A televisão está no modo mute\nVolume: " + this.Volume+"\n");
			}
			else {
	            System.out.println("A TV está desligada\n");
	        }
		
		}

		public int getVolume() {
			return Volume;
		}

		public void setVolume(int volume) {
			this.Volume = volume;
		}

		public int getCanal() {
			return Canais;
		}

		public void setCanal(int canal) {
			this.Canais = canal;
		}

		public boolean tvLigada() {
			return OnOff;
		}

		public void setTvLigada (boolean tvLigada) {
			this.OnOff = tvLigada;
		}

	}
	

