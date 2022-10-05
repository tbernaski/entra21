interface Pingable {
    ping(): void;
}



class Point implements Pingable {     
_x: number = 0;
private y: number = 0;
readonly name: string = "This point";

constructor (otherName?: string) {
    if (otherName !== undefined){
        this.name = otherName;
    }

}

static jump() {
    console.log('jump');
}

 ping(): void {
     console.log("ping");
 }


printPoint = () => {
    return `x: ${this.x}, Y: ${this.y}`
    }

    get x (): number {  //getter
        return this._x;
    };

    set x (val: number) {  //setter
        this._x = val;
    };
}

class DPoint extends Point{    //classe  
 z: number = 0;

printPoint = () => {
    return `x: ${this.x}, Y: ${this.y}, Z: ${this.z}`
    }
}

type TPoint =  {     //tipo
    x: number,
    y: number
    }

let p = new Point("That point") ;
p.x = 12;
p.y = 6;
console.log(p.printPoint());
p.name = "That point"





class CBox<T> {
    _contents: T[] = [];

    addItem = (item: T) => this._contents.push(item);

    removeLastItem = () => this._contents.pop();

    get contents () {  //getter
        return this._contents;
    };

    set contents (val: T[]) {  //setter
        this._contents = val;
    };
}



















