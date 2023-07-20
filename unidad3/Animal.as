package  {
	import flash.display.MovieClip;

	//clase apstracta
	public class Animal extends MovieClip {

	private var _estado:String="";
	
	
		public function Animal() {
			// constructor code
			
			comiendo();
			
			
			
		}
		
		
		public function comiendo():void{
			estado="Animal comiendo";
			trace (estado);
		}
		
		public function caminando():void{
			estado="Animal comiendo"
			trace(estado);
		}
		public function sentado():void{
			estado="Animal sentado";
			trace (estado);
		}
	public function get estado(): String{ //este regresa el valor de la variable privada 
		return _estado;
	}
	
	public function set estado(value:String):void{
		_estado=value;
	}
	
	
	}
	
}
