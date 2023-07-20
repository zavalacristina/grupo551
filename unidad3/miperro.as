package  {
	
	public class miperro extends Animal{

		public function miperro() {
			// constructor code
			super();
		}

		override public function comiendo ():void {
			super.comiendo();
			this.gotoAndStop(1);
			trace("Perro comiendo");
		}
		
		override public function caminando ():void {
			super.caminando();
			this.gotoAndStop(2);
			trace("Perro caminando");
		}
		
		override public function sentado ():void {
			super.sentado();
			this.gotoAndStop(3);
			trace("Perro sentado");
		}
	}
	
}
