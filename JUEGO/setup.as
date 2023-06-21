package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	
	public class setup extends MovieClip {
		private var piso_new:piso= new piso();
		private var antagonista_new: antagonista=new antagonista();
		static var protagonista_new: protagonista=new protagonista();
		static var puntos:Number =0;
		static var puntos_box_new: puntos_box=new puntos_box();
		
		public function setup() {
			// constructor code
			addChild (piso_new);
			addChild (antagonista_new);
			addChild (protagonista_new);
			addChild (puntos_box_new);
			
			
			piso_new.y=370;
			piso_new.x=275;
			antagonista_new.y=80;
			antagonista_new.x=275;
			protagonista_new.x=275;
			protagonista_new.y=320;
			puntos_box_new.x=300;
			puntos_box_new.y=120;
			puntos_box_new.puntostxt.text= String(puntos);
			
			this.addEventListener(Event.ENTER_FRAME,actualiza_puntos);
			
		}
		public function actualiza_puntos(e:Event){
			puntos_box_new.puntostxt.text= String(puntos);
		}
	}
	
}
