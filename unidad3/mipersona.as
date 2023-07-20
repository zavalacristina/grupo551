package  {
	
	public class mipersona extends Animal{

		public function mipersona() {
			// constructor code
			super();
		}
		
		
		override public function comiendo ():void {
			super.comiendo();
			this.gotoAndStop(1);
			trace("persona comiendo");
		}
		
		override public function caminando ():void {
			super.caminando();
			this.gotoAndStop(2);
			trace("persona caminando");
		}
		
		override public function sentado ():void {
			super.sentado();
			this.gotoAndStop(3);
			trace("persona sentado");
		}

	}
	
}
