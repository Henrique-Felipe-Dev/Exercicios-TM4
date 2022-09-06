import { Cachorro } from "./src/cachorro";
import { Cavalo } from "./src/cavalo";
import { Preguica } from "./src/preguica";

let dog = new Cachorro("Spike", 5)
let cavalo = new Cavalo("Spirit", 8)
let preguica = new Preguica("Flash", 15)

dog.emitirSom()
cavalo.emitirSom()
preguica.emitirSom()