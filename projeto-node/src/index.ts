console.log("teste");

type Rect = {
    width? :number,
    height?:number
}

type Triangle = {
    angle: number,
    type: "isosceles" | "scalene" | "obruse"
}

type Circle = {
    radius: number
}

type GeometricFigure = Rect | Triangle | Circle;

let rect: Rect = {
    width: 20,
};

let t: GeometricFigure = {
    angle: 45,
    type: "isosceles"
}

t = {
    radius: 9
}

t = {
    height: 50
    width: 

console.log(rect.height);

let f = (x:number, y:number): number => {
    return x+y;
}

let numeros: number;
numeros = f(2,6);



// let numeros: number | string;
// numeros = "";