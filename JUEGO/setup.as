package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		private var piso_new: piso=new piso();
			private var protagonista_new:protagonista=new protagonista();
			private var antogonista_new:antogonista=new antogonista();
		
		public function setup() {
			// constructor code
			trace("hola mundo");
			
			addChild(piso_new);
			addChild(protagonista_new);
			addChild(antogonista_new);
			piso_new.y = 370;
			piso_new.x = 275;
			protagonista_new.x=275;
			protagonista_new.y=310;
			antogonista_new.y=80;
			antogonista_new.x=275;
		}
	}
	
}
