package  {
	
	public class miserpiente extends Animal{

		public function miserpiente() {
			// constructor code
			super();
		}
		override public function comiendo ():void {
			super.comiendo();
			this.gotoAndStop(1);
			trace("serpiente comiendo");
		}
		
		override public function caminando ():void {
			super.caminando();
			this.gotoAndStop(2);
			trace("serpiente caminando");
		}
		
		override public function sentado ():void {
			super.sentado();
			this.gotoAndStop(3);
			trace("serpiente sentado");
		}

	}
	
}
