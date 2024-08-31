export class FooterComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const valuesObj = {
            html: {
                cuerpoWebsite: document.getElementById("cuerpoWeb")
            },
            svg: {
                SVG_XMLNS: "http://www.w3.org/2000/svg",
                SVG_XLINK: "http://www.w3.org/1999/xlink"
            }
        }


        // Crear los elementos HTML necesarios
        let footerTag = document.createElement("footer");
        let spanIconFlechaIzq = document.createElement("span");
        let divSeccionMedia = document.createElement("div");
        let divContentTop = document.createElement("div");
        let spanIconFlechaDer = document.createElement("span");
        let spanReferenciaPeq = document.createElement("span");
        let spanReferencia1 = document.createElement("span");
        let spanReferencia2 = document.createElement("span");
        
        let svgIconHeart = document.createElementNS(valuesObj.svg.SVG_XMLNS, "svg");
        let svgIconHeartGTag1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let svgIconHeartGTag2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let svgIconHeartGTag3 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let svgIconHeartPathTag = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let svgIconColombia = document.createElementNS(valuesObj.svg.SVG_XMLNS, "svg");
        let svgIconColombiaGTag2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let svgIconColombiaGTag1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let svgIconColombiaGTag3 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let svgIconColombiaPathTag1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let svgIconColombiaPathTag2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let svgIconColombiaPathTag3 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");


        // Crear los nodos de texto correspondientes
        let textIconFlechaIzq = document.createTextNode("chevron_left");
        let textReferencia1 = document.createTextNode("Hecho con");
        let textReferencia2 = document.createTextNode("Desde");
        let textLetraPequenya = document.createTextNode("Proyecto Campus Survey");
        let textIconFlechaDer = document.createTextNode("chevron_right");


        // Agregándole los atributos a cada etiqueta
        footerTag.setAttribute("class", "pieDePagina");
        footerTag.setAttribute("id", "pieDePagina");

        spanIconFlechaIzq.setAttribute("class", "material-symbols-outlined flechaNav flechaNav--disabled");
        spanIconFlechaIzq.setAttribute("data-estado", '{"estado": 0, "paginaActual": 0}');

        divSeccionMedia.setAttribute("class", "seccionMedia");
        divContentTop.setAttribute("class", "contentTop");

        spanReferencia1.setAttribute("class", "seccionMedia__referencia");
        spanReferencia2.setAttribute("class", "seccionMedia__referencia");



        svgIconHeart.setAttributeNS(null, "viewBox", "0 0 16 16");
        svgIconHeart.setAttributeNS(null, "fill", "none");
        svgIconHeart.setAttributeNS(null, "class", "seccionMedia__iconHeart");
        
        svgIconHeartGTag1.setAttributeNS(null, "id", "SVGRepo_bgCarrier");
        svgIconHeartGTag1.setAttributeNS(null, "stroke-width", "0")
        
        svgIconHeartGTag2.setAttributeNS(null, "id", "SVGRepo_tracerCarrier");
        svgIconHeartGTag2.setAttributeNS(null, "stroke-linecap", "round");
        svgIconHeartGTag2.setAttributeNS(null, "stroke-linejoin", "round");
        
        svgIconHeartGTag3.setAttributeNS(null, "id", "SVGRepo_iconCarrier");
        
        svgIconHeartPathTag.setAttributeNS(null, "d", "M1.24264 8.24264L8 15L14.7574 8.24264C15.553 7.44699 16 6.36786 16 5.24264V5.05234C16 2.8143 14.1857 1 11.9477 1C10.7166 1 9.55233 1.55959 8.78331 2.52086L8 3.5L7.21669 2.52086C6.44767 1.55959 5.28338 1 4.05234 1C1.8143 1 0 2.8143 0 5.05234V5.24264C0 6.36786 0.44699 7.44699 1.24264 8.24264Z");
        svgIconHeartPathTag.setAttributeNS(null, "fill", "#ff0000");



        svgIconColombia.setAttributeNS(null, "viewBox", "0 0 36 36");
        svgIconColombia.setAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
        svgIconColombia.setAttributeNS(null, "aria-hidden", "true");
        svgIconColombia.setAttributeNS(null, "role", "img");
        svgIconColombia.setAttributeNS(null, "class", "iconify iconify--twemoji seccionMedia__iconColombia");
        svgIconColombia.setAttributeNS(null, "preserveAspectRatio", "xMidYMid meet");
        svgIconColombia.setAttributeNS(null, "fill", "#000000");

        svgIconColombiaGTag1.setAttributeNS(null, "id", "SVGRepo_bgCarrier");
        svgIconColombiaGTag1.setAttributeNS(null, "stroke-width", "0")
        
        svgIconColombiaGTag2.setAttributeNS(null, "id", "SVGRepo_tracerCarrier");
        svgIconColombiaGTag2.setAttributeNS(null, "stroke-linecap", "round");
        svgIconColombiaGTag2.setAttributeNS(null, "stroke-linejoin", "round");
        
        svgIconColombiaGTag3.setAttributeNS(null, "id", "SVGRepo_iconCarrier");
        
        svgIconColombiaPathTag1.setAttributeNS(null, "fill", "#FBD116");
        svgIconColombiaPathTag1.setAttributeNS(null, "d", "M32 5H4a4 4 0 0 0-4 4v9h36V9a4 4 0 0 0-4-4z");
        
        svgIconColombiaPathTag2.setAttributeNS(null, "fill", "#22408C");
        svgIconColombiaPathTag2.setAttributeNS(null, "d", "M0 18h36v7H0z");
        
        svgIconColombiaPathTag3.setAttributeNS(null, "fill", "#CE2028");
        svgIconColombiaPathTag3.setAttributeNS(null, "d", "M0 27a4 4 0 0 0 4 4h28a4 4 0 0 0 4-4v-2H0v2z");



        spanReferenciaPeq.setAttribute("class", "seccionMedia__letraPequenya");

        spanIconFlechaDer.setAttribute("class", "material-symbols-outlined flechaNav flechaNav--active");
        spanIconFlechaDer.setAttribute("data-estado", '{"estado": 1, "paginaActual": 0}');


        // Agregar los nodos de texto correspondientes
        spanIconFlechaIzq.appendChild(textIconFlechaIzq);
        spanReferencia1.appendChild(textReferencia1);
        spanReferencia2.appendChild(textReferencia2);
        spanReferenciaPeq.appendChild(textLetraPequenya);
        spanIconFlechaDer.appendChild(textIconFlechaDer);


        // Creando el DOM para insertarlo al HTML
        valuesObj.html.cuerpoWebsite.appendChild(footerTag);
        footerTag.appendChild(spanIconFlechaIzq);
        footerTag.appendChild(divSeccionMedia);
        divSeccionMedia.appendChild(divContentTop);
        divContentTop.appendChild(spanReferencia1);
        divContentTop.appendChild(svgIconHeart);
        svgIconHeart.appendChild(svgIconHeartGTag1);
        svgIconHeart.appendChild(svgIconHeartGTag2);
        svgIconHeart.appendChild(svgIconHeartGTag3);
        svgIconHeartGTag3.appendChild(svgIconHeartPathTag);
        divContentTop.appendChild(spanReferencia2);
        divContentTop.appendChild(svgIconColombia);
        svgIconColombia.appendChild(svgIconColombiaGTag1);
        svgIconColombia.appendChild(svgIconColombiaGTag2);
        svgIconColombia.appendChild(svgIconColombiaGTag3);
        svgIconColombiaGTag3.appendChild(svgIconColombiaPathTag1);
        svgIconColombiaGTag3.appendChild(svgIconColombiaPathTag2);
        svgIconColombiaGTag3.appendChild(svgIconColombiaPathTag3);
        divSeccionMedia.appendChild(spanReferenciaPeq);
        footerTag.appendChild(spanIconFlechaDer);


        // Creando los eventos pertinentes
        
    }
}

customElements.define("footer-component", FooterComponent);