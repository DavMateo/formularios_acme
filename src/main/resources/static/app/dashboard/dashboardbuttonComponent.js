export class DashboardbuttonComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const cuerpoWebsite = document.getElementById("cuerpoWebDashboard");
        const SVG_XMLNS = "http://www.w3.org/2000/svg";


        // Creando los elementos HTML necesarios
        let buttonCrearForm = document.createElement("button");
        let svgIconoMas = document.createElementNS(SVG_XMLNS, "svg");
        let lineSvgIcono1 = document.createElementNS(SVG_XMLNS, "line");
        let lineSvgIcono2 = document.createElementNS(SVG_XMLNS, "line");


        // Agregándole los atributos a cada etiqueta
        buttonCrearForm.setAttribute("id", "btnCrearForm");
        buttonCrearForm.setAttribute("class", "btnFlotante");
        buttonCrearForm.setAttribute("title", "Crear nuevo formulario");

        svgIconoMas.setAttributeNS(null, "viewBox", "0 0 24 24");
        svgIconoMas.setAttributeNS(null, "fill", "none");
        svgIconoMas.setAttributeNS(null, "stroke", "currentColor");
        svgIconoMas.setAttributeNS(null, "stroke-width", "2");
        svgIconoMas.setAttributeNS(null, "stroke-linecap", "round");
        svgIconoMas.setAttributeNS(null, "stroke-linejoin", "round");
        svgIconoMas.setAttributeNS(null, "class", "btnFlotante__iconSVG");

        lineSvgIcono1.setAttributeNS(null, "x1", "12");
        lineSvgIcono1.setAttributeNS(null, "y1", "5");
        lineSvgIcono1.setAttributeNS(null, "x2", "12");
        lineSvgIcono1.setAttributeNS(null, "y2", "19");

        lineSvgIcono2.setAttributeNS(null, "x1", "5");
        lineSvgIcono2.setAttributeNS(null, "y1", "12");
        lineSvgIcono2.setAttributeNS(null, "x2", "19");
        lineSvgIcono2.setAttributeNS(null, "y2", "12");


        // Creando el DOM para insertarlo al HTML
        cuerpoWebsite.appendChild(buttonCrearForm);
        buttonCrearForm.appendChild(svgIconoMas);
        svgIconoMas.appendChild(lineSvgIcono1);
        svgIconoMas.appendChild(lineSvgIcono2);


        // Creando los eventos pertinentes
    }
}

customElements.define("dashboardbutton-component", DashboardbuttonComponent);