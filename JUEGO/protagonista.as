package  {
	import flash.display.MovieClip;
	import flash.events.Event;
    import flash.events.KeyboardEvent;
	public class protagonista extends MovieClip {
		private var vel:int=10;
		private var der: Boolean=false;
		private var izq: Boolean=false;
        private var limite_x_der: int=510;
		private var limite_x_izq: int=35;
		public function protagonista() {
			// constructor code
			addEventListener(Event.ENTER_FRAME, motor);
			
			
		}
		public function motor(e: Event){
			if(der ){
			if(x<=limite_x_der){
				x+=vel;
			}
			
			
		}else if(izq){
			if(x>=limite_x_izq){
				x-=vel;
			}
			
			
		}
        control();
	}
	public function control(){
		stage.addEventListener(KeyboardEvent.KEY_DOWN, key_down);
		stage.addEventListener(KeyboardEvent.KEY_UP, key_up);
	}
	public function key_down(e:KeyboardEvent): void{
		switch (e.keyCode){
		case 39:
	der=true;
	break;
	case 37:
	izq=true;
	break;
	}
	

	}
	
public function key_up(e:KeyboardEvent): void{
	switch (e.keyCode){
		case 39:
	der=false;
	break;
	case 37:
	izq=false;
	break;
	}
	
}
}
	
	
	
}
	
	