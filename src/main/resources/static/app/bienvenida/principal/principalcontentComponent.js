export class PrincipalcontentComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const cuerpoWebsite = document.getElementById("cuerpoWeb");

        // Creando los elementos HTML necesarios
        let mainTag = document.createElement("main");
        let divContIzqTag = document.createElement("div");
        let divContDerTag = document.createElement("div");
        let h1TituloTag = document.createElement("h1");
        let pDescrTag = document.createElement("p");
        let divContShape = document.createElement("div");
        let imgShape = document.createElement("img");


        // Creando los nodos de texto correspondientes
        let textH1Titulo = document.createTextNode("Lorem Ipsum Dolor Sit Title 1");
        let textPDescr = document.createTextNode("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam dolore molestiae labore, voluptatibus tempora harum hic eos voluptate quo maxime molestias quam fugiat beatae est facilis optio, fugit, dolor pariatur et placeat animi odio voluptatem tenetur consectetur. Est tempora consectetur omnis libero velit blanditiis, tempore sed fugit. Impedit reiciendis a repudiandae odit eaque! Quaerat quod, quia minus veniam neque facilis?");


        // Agregándole los atributos a cada etiqueta
        mainTag.setAttribute("class", "principal");
        mainTag.setAttribute("id", "principal");

        divContIzqTag.setAttribute("class", "contenidoIzq");
        divContDerTag.setAttribute("class", "contenidoDer");

        h1TituloTag.setAttribute("class", "contenidoIzq__titulo");
        pDescrTag.setAttribute("class", "contenidoIzq__descripcion");

        divContShape.setAttribute("class", "containerShape");

        imgShape.setAttribute("src", "/assets/img/png/shapes/shapeOne.png");
        imgShape.setAttribute("alt", "shape_oneImg");
        imgShape.setAttribute("class", "containerShape__img");
        imgShape.setAttribute("title", "Shape n°1");


        // Creando el DOM para insertarlo al HTML
        cuerpoWebsite.appendChild(mainTag);
        mainTag.appendChild(divContIzqTag);
        mainTag.appendChild(divContDerTag);
        divContIzqTag.appendChild(h1TituloTag);
        h1TituloTag.appendChild(textH1Titulo);
        divContIzqTag.appendChild(pDescrTag);
        pDescrTag.appendChild(textPDescr);
        divContDerTag.appendChild(divContShape);
        divContShape.appendChild(imgShape);
    }
}

customElements.define("principalcontent-component", PrincipalcontentComponent);