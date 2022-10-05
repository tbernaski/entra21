
type Box<Type = any > = {
    contents?: Type[]
    contentLenght: () => number;
}

let box : Box<string> = {
    contents: [],
    contentLenght: () => box.contents!.length
};

box.contents?.push("conteudo");

let box2 : Box<number> = {
    contents: []
};

box2.contentLenght!();
box2.contents?.push(12);

let box3 : Box = {
    contents: []
};

box3.contents?.push("teste");
box3.contents?.push(123);

function tes<Type>(arg: Type): Type {
    return arg;
};

let n : string = tes("123");