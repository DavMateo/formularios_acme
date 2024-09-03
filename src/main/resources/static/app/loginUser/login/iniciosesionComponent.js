export class IniciosesionComponent extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const valuesObj = {
            html: {
                cuerpoWebsite: document.getElementById("cuerpoWebLogin")
            },
            svg: {
                SVG_XMLNS: "http://www.w3.org/2000/svg",
                SVG_XLINK: "http://www.w3.org/1999/xlink",
                SVG_BX: "https://boxy-svg.com"
            }
        }


        // Creando los elementos HTML necesarios
        let principal = document.createElement("main");
        let divContainerLogin = document.createElement("div");
        let divImgSection = document.createElement("div");
        let divInfoIniciarTarj = document.createElement("div");
        let buttonEmpezar = document.createElement("button");
        let svgIconEmpezar = document.createElementNS(valuesObj.svg.SVG_XMLNS, "svg");
        let defsIconEmpezar = document.createElementNS(valuesObj.svg.SVG_XMLNS, "defs");
        let pathDefsIconEmpezar1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let pathDefsIconEmpezar2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let pathIconEmpezar1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let pathIconEmpezar2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let divInfoTarjeta = document.createElement("div");
        let spanBienvenida = document.createElement("span");
        let h1Titulo = document.createElement("h1");
        let pTextoParrafo = document.createElement("p");
        let imgInfoTarjeta = document.createElement("img");
        let divSeccionFormulario = document.createElement("div");
        let divEncabezadoFormulario = document.createElement("div");
        let spanTituloEncabezadoForm = document.createElement("span");
        let divContenidoLogin = document.createElement("div");
        let formFormularioLogin = document.createElement("form");
        let divFormularioEmail = document.createElement("div");
        let labelTextoEmail = document.createElement("label");
        let inputFieldEmail = document.createElement("input");
        let divFormularioContrasenya = document.createElement("div");
        let labelTextoContrasenya = document.createElement("label");
        let inputFieldContrasenya = document.createElement("input");
        let divFormularioCheckbox = document.createElement("div");
        let divFormularioCheckboxCbx = document.createElement("div");
        let inputFieldCheckbox = document.createElement("input");
        let labelTextoCheckbox = document.createElement("label");
        let svgAnimacionChecked = document.createElementNS(valuesObj.svg.SVG_XMLNS, "svg");
        let pathAnimacionChecked = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let divBtnIniciarSesion = document.createElement("div");
        let buttonLogin = document.createElement("button");
        let spanSeparadorLogin = document.createElement("span");
        let divCuentas = document.createElement("div");
        let divCuentaFb = document.createElement("div");
        let svgLogoFb = document.createElementNS(valuesObj.svg.SVG_XMLNS, "svg");
        let gSvgLogoFb1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let gSvgLogoFb2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let gSvgLogoFb3 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let circleSvgLogoFb = document.createElementNS(valuesObj.svg.SVG_XMLNS, "circle");
        let pathSvgLogoFb = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let spanTextoAccionFb = document.createElement("span");
        let divCuentaGoogle = document.createElement("div");
        let svgLogoGoogle = document.createElementNS(valuesObj.svg.SVG_XMLNS, "svg");
        let gSvgLogoGoogle1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let gSvgLogoGoogle2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let gSvgLogoGoogle3 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let titleGSvgLogoGoogle = document.createElementNS(valuesObj.svg.SVG_XMLNS, "title");
        let descGSvgLogoGoogle = document.createElementNS(valuesObj.svg.SVG_XMLNS, "desc");
        let defsGSvgLogoGoogle = document.createElementNS(valuesObj.svg.SVG_XMLNS, "defs");
        let gSvgLogoGoogle4 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let gSvgLogoGoogle5 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let gSvgLogoGoogle6 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "g");
        let pathGSvgLogoGoogle1 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let pathGSvgLogoGoogle2 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let pathGSvgLogoGoogle3 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let pathGSvgLogoGoogle4 = document.createElementNS(valuesObj.svg.SVG_XMLNS, "path");
        let spanTextoAccionGoogle = document.createElement("span");
        let divFooterFormulario = document.createElement("div");
        let spanFooterFormInfoTexto = document.createElement("span");
        let spanFooterFormlinkRegistro = document.createElement("span");


        // Creando los nodos de texto correspondientes
        let textSpanBienvenida = document.createTextNode("¡Bienvenido de nuevo!");
        let textSpaninfoTarjetaTitulo = document.createTextNode("Vamos a empezar");
        let textPInfoTarjetaParrafo = document.createTextNode("Inicia sesión con tu cuenta y sigue disfrutando de todas las herramientas que tiene Survey Campus a tu disposición. ¡No te olvides de calificar nuestro servicio!");
        let textSpanEncabezadoFormTitulo = document.createTextNode("Inicia Sesión");
        let textLabelFormEmail = document.createTextNode("Tu correo electrónico");
        let textLabelFormPassword = document.createTextNode("Tu contraseña");
        let textButtonFormLogin = document.createTextNode("Iniciar Sesión");
        let textSpanSeparadorLogin = document.createTextNode("Or");
        let textSpanCuentaFb = document.createTextNode("Inicia con Facebook");
        let textTitleSvg = document.createTextNode("Google-color");
        let textDescSvg = document.createTextNode("Created with Sketch");
        let textSpanCuentaGoogle = document.createTextNode("Inicia con Google");
        let textSpanFooterFormInfoText = document.createTextNode("¿Aún no tienes una cuenta?");
        let textSpanFooterFormLinkRegistro = document.createTextNode("¡Regístrate aquí!");


        // Agregándole los atributos a cada etiqueta
        principal.setAttribute("class", "principalForm");
        principal.setAttribute("id", "principalForm");

        divContainerLogin.setAttribute("class", "container");
        divContainerLogin.setAttribute("id", "container");
        divContainerLogin.setAttribute("data-page", "login");

        divImgSection.setAttribute("class", "imgSection");

        divInfoIniciarTarj.setAttribute("class", "imgSection__infoIniciar");

        buttonEmpezar.setAttribute("class", "isii__btnEmpezar");
        buttonEmpezar.setAttribute("title", "Ir a Registrar Usuario");

        svgIconEmpezar.setAttributeNS(null, "viewBox", "100 189.225 200 48.485");
        svgIconEmpezar.setAttribute("xmlns:bx", valuesObj.svg.SVG_BX);
        svgIconEmpezar.setAttributeNS(null, "class", "isiibe__btnIconSVG");

        pathDefsIconEmpezar1.setAttributeNS(null, "id", "path-0");
        pathDefsIconEmpezar1.setAttributeNS(null, "class", "path-0");
        pathDefsIconEmpezar1.setAttributeNS(null, "d", "M 53.872 283.67 L 69.865 283.67 C 111.759 283.67 152.427 292.929 194.444 292.929");
        
        pathDefsIconEmpezar2.setAttributeNS(null, "id", "path-1");
        pathDefsIconEmpezar2.setAttributeNS(null, "class", "path-1");
        pathDefsIconEmpezar2.setAttributeNS(null, "d", "M 132.155 285.354 C 173.54 290.421 207.498 283.884 232.323 296.296 C 247.068 300.206 262.373 304.933 271.886 303.03 C 289.136 299.58 303.121 275.091 310.606 261.785 C 347.07 212.959 363.636 180.305 363.636 144.781 C 370.175 127.871 370.37 118.73 370.37 106.902 C 360.922 99.138 347.014 117.633 342.593 122.054 C 325.087 141.243 306.4 146.8 288.721 157.407 C 254.65 165.847 235.938 166.193 218.013 170.034 C 207.548 172.276 197.709 176.768 186.869 176.768 L 182.66 176.768 C 176.768 176.768 170.875 176.768 164.983 176.768");

        pathIconEmpezar1.setAttributeNS(null, "class", "path-2");
        pathIconEmpezar1.setAttributeNS(null, "d", "M 99.327 209.495 L 300 210 C 300 210 254.208 233.064 254.208 233.905");

        pathIconEmpezar2.setAttributeNS(null, "class", "path-3");
        pathIconEmpezar2.setAttributeNS(null, "d", "M 100.671 194 L 300.671 195.178");

        divInfoTarjeta.setAttribute("class", "isii__infoTarjeta");

        spanBienvenida.setAttribute("class", "isiiit__bienvenida");

        h1Titulo.setAttribute("class", "isiiit__titulo");

        pTextoParrafo.setAttribute("class", "isiiit__parrafo");

        imgInfoTarjeta.setAttribute("src", "/assets/img/png/registroInicioSesion/mujer_trabajando_con_laptop.png");
        imgInfoTarjeta.setAttribute("alt", "img_login");
        imgInfoTarjeta.setAttribute("class", "isii__imgTarjeta");
        imgInfoTarjeta.setAttribute("title", "imagen inicio sesión");

        divSeccionFormulario.setAttribute("class", "formSection");

        divEncabezadoFormulario.setAttribute("class", "encabezadoForm");

        spanTituloEncabezadoForm.setAttribute("class", "encabezadoForm__titulo");

        divContenidoLogin.setAttribute("class", "contentLogin");

        formFormularioLogin.setAttribute("id", "formLogin");
        formFormularioLogin.setAttribute("class", "formLogin");

        divFormularioEmail.setAttribute("class", "formLogin__email");

        labelTextoEmail.setAttribute("for", "email");

        inputFieldEmail.setAttribute("type", "email");
        inputFieldEmail.setAttribute("name", "email");
        inputFieldEmail.setAttribute("id", "email");
        inputFieldEmail.setAttribute("class", "formLogin__campoTexto");
        inputFieldEmail.setAttribute("required", "true");

        divFormularioContrasenya.setAttribute("class", "formLogin__contrasenya");

        labelTextoContrasenya.setAttribute("for", "contrasenya");

        inputFieldContrasenya.setAttribute("type", "password");
        inputFieldContrasenya.setAttribute("name", "contrasenya");
        inputFieldContrasenya.setAttribute("id", "contrasenya")
        inputFieldContrasenya.setAttribute("class", "formLogin__campoTexto");
        inputFieldContrasenya.setAttribute("required", "true");

        divFormularioCheckbox.setAttribute("class", "formLogin__checkbox");

        divFormularioCheckboxCbx.setAttribute("class", "formLogin__checkbox-cbx");

        inputFieldCheckbox.setAttribute("type", "checkbox");
        inputFieldCheckbox.setAttribute("name", "recordarCuenta");
        inputFieldCheckbox.setAttribute("id", "recordarCuenta");
        inputFieldCheckbox.setAttribute("class", "formLogin__campoCheck");

        labelTextoCheckbox.setAttribute("for", "recordarCuenta");

        svgAnimacionChecked.setAttributeNS(null, "width", "15");
        svgAnimacionChecked.setAttributeNS(null, "height", "14");
        svgAnimacionChecked.setAttributeNS(null, "viewBox", "0 0 15 14");
        svgAnimacionChecked.setAttributeNS(null, "fill", "none");

        pathAnimacionChecked.setAttributeNS(null, "d", "M2 8.36364L6.23077 12L13 2");

        divBtnIniciarSesion.setAttribute("class", "formLogin__btnIniciarSesion");

        buttonLogin.setAttribute("class", "formLogin__btnLogin");
        buttonLogin.setAttribute("id", "btnLogin");

        spanSeparadorLogin.setAttribute("class", "contentLogin__separador");

        divCuentas.setAttribute("class", "cuenta");

        divCuentaFb.setAttribute("class", "cuenta__facebook");

        svgLogoFb.setAttributeNS(null, "viewBox", "126.445 2.281 589 589");
        svgLogoFb.setAttributeNS(null, "fill", "#000000");

        gSvgLogoFb1.setAttributeNS(null, "id", "SVGRepo_bgCarrier");
        gSvgLogoFb1.setAttributeNS(null, "stroke-width", "0");

        gSvgLogoFb2.setAttributeNS(null, "id", "SVGRepo_tracerCarrier");
        gSvgLogoFb2.setAttributeNS(null, "stroke-linecap", "round");
        gSvgLogoFb2.setAttributeNS(null, "stroke-linejoin", "round");

        gSvgLogoFb3.setAttributeNS(null, "id", "SVGRepo_iconCarrier");

        circleSvgLogoFb.setAttributeNS(null, "cx", "420.945");
        circleSvgLogoFb.setAttributeNS(null, "cy", "296.781");
        circleSvgLogoFb.setAttributeNS(null, "r", "294.5");
        circleSvgLogoFb.setAttributeNS(null, "fill", "#3c5a9a");

        pathSvgLogoFb.setAttributeNS(null, "d", "M516.704 92.677h-65.239c-38.715 0-81.777 16.283-81.777 72.402.189 19.554 0 38.281 0 59.357H324.9v71.271h46.174v205.177h84.847V294.353h56.002l5.067-70.117h-62.531s.14-31.191 0-40.249c0-22.177 23.076-20.907 24.464-20.907 10.981 0 32.332.032 37.813 0V92.677h-.032z");
        pathSvgLogoFb.setAttributeNS(null, "fill", "#ffffff");

        divCuentaGoogle.setAttribute("class", "cuenta__google");

        svgLogoGoogle.setAttributeNS(null, "viewBox", "0 0 48.00 48.00");
        svgLogoGoogle.setAttributeNS(null, "version", "1.1");
        svgLogoGoogle.setAttribute("xmlns:xlink", valuesObj.svg.SVG_XLINK);
        svgLogoGoogle.setAttributeNS(null, "fill", "#000000");

        gSvgLogoGoogle1.setAttributeNS(null, "id", "SVGRepo_bgCarrier");
        gSvgLogoGoogle1.setAttributeNS(null, "stroke-width", "0");

        gSvgLogoGoogle2.setAttributeNS(null, "id", "SVGRepo_tracerCarrier");
        gSvgLogoGoogle2.setAttributeNS(null, "stroke-linecap", "round");
        gSvgLogoGoogle2.setAttributeNS(null, "stroke-linejoin", "round");
        
        gSvgLogoGoogle3.setAttributeNS(null, "id", "SVGRepo_iconCarrier");

        gSvgLogoGoogle4.setAttributeNS(null, "id", "Icons");
        gSvgLogoGoogle4.setAttributeNS(null, "stroke-width", "0.00048000000000000007");
        gSvgLogoGoogle4.setAttributeNS(null, "fill", "none");
        gSvgLogoGoogle4.setAttributeNS(null, "fill-rule", "evenodd");

        gSvgLogoGoogle5.setAttributeNS(null, "id", "Color-");
        gSvgLogoGoogle5.setAttributeNS(null, "transform", "translate(-401.000000, -860.000000)");

        gSvgLogoGoogle6.setAttributeNS(null, "id", "Google");
        gSvgLogoGoogle6.setAttributeNS(null, "transform", "translate(401.000000, 860.000000)");

        pathGSvgLogoGoogle1.setAttributeNS(null, "d", "M9.82727273,24 C9.82727273,22.4757333 10.0804318,21.0144 10.5322727,19.6437333 L2.62345455,13.6042667 C1.08206818,16.7338667 0.213636364,20.2602667 0.213636364,24 C0.213636364,27.7365333 1.081,31.2608 2.62025,34.3882667 L10.5247955,28.3370667 C10.0772273,26.9728 9.82727273,25.5168 9.82727273,24");
        pathGSvgLogoGoogle1.setAttributeNS(null, "id", "Fill-1");
        pathGSvgLogoGoogle1.setAttributeNS(null, "fill", "#FBBC05");
        
        pathGSvgLogoGoogle2.setAttributeNS(null, "d", "M23.7136364,10.1333333 C27.025,10.1333333 30.0159091,11.3066667 32.3659091,13.2266667 L39.2022727,6.4 C35.0363636,2.77333333 29.6954545,0.533333333 23.7136364,0.533333333 C14.4268636,0.533333333 6.44540909,5.84426667 2.62345455,13.6042667 L10.5322727,19.6437333 C12.3545909,14.112 17.5491591,10.1333333 23.7136364,10.1333333");
        pathGSvgLogoGoogle2.setAttributeNS(null, "id", "Fill-2");
        pathGSvgLogoGoogle2.setAttributeNS(null, "fill", "#EB4335");

        pathGSvgLogoGoogle3.setAttributeNS(null, "d", "M23.7136364,37.8666667 C17.5491591,37.8666667 12.3545909,33.888 10.5322727,28.3562667 L2.62345455,34.3946667 C6.44540909,42.1557333 14.4268636,47.4666667 23.7136364,47.4666667 C29.4455,47.4666667 34.9177955,45.4314667 39.0249545,41.6181333 L31.5177727,35.8144 C29.3995682,37.1488 26.7323182,37.8666667 23.7136364,37.8666667");
        pathGSvgLogoGoogle3.setAttributeNS(null, "id", "Fill-3");
        pathGSvgLogoGoogle3.setAttributeNS(null, "fill", "#34A853");

        pathGSvgLogoGoogle4.setAttributeNS(null, "d", "M46.1454545,24 C46.1454545,22.6133333 45.9318182,21.12 45.6113636,19.7333333 L23.7136364,19.7333333 L23.7136364,28.8 L36.3181818,28.8 C35.6879545,31.8912 33.9724545,34.2677333 31.5177727,35.8144 L39.0249545,41.6181333 C43.3393409,37.6138667 46.1454545,31.6490667 46.1454545,24");
        pathGSvgLogoGoogle4.setAttributeNS(null, "id", "Fill-4");
        pathGSvgLogoGoogle4.setAttributeNS(null, "fill", "#4285F4");

        divFooterFormulario.setAttribute("class", "footerForm");

        spanFooterFormInfoTexto.setAttribute("class", "footerForm__infoText");

        spanFooterFormlinkRegistro.setAttribute("id", "linkRegistro");
        spanFooterFormlinkRegistro.setAttribute("class", "footerForm__linkRegistro");


        // Agregar los nodos de texto correspondientes
        spanBienvenida.appendChild(textSpanBienvenida);
        h1Titulo.appendChild(textSpaninfoTarjetaTitulo);
        pTextoParrafo.appendChild(textPInfoTarjetaParrafo);
        spanTituloEncabezadoForm.appendChild(textSpanEncabezadoFormTitulo);
        labelTextoEmail.appendChild(textLabelFormEmail);
        labelTextoContrasenya.appendChild(textLabelFormPassword);
        buttonLogin.appendChild(textButtonFormLogin);
        spanSeparadorLogin.appendChild(textSpanSeparadorLogin);
        spanTextoAccionFb.appendChild(textSpanCuentaFb);
        titleGSvgLogoGoogle.appendChild(textTitleSvg);
        descGSvgLogoGoogle.appendChild(textDescSvg);
        spanTextoAccionGoogle.appendChild(textSpanCuentaGoogle);
        spanFooterFormInfoTexto.appendChild(textSpanFooterFormInfoText);
        spanFooterFormlinkRegistro.appendChild(textSpanFooterFormLinkRegistro);


        // Creando el DOM para insertarlo al HTML
        valuesObj.html.cuerpoWebsite.appendChild(principal);
        principal.appendChild(divContainerLogin);
        divContainerLogin.appendChild(divImgSection);
        divImgSection.appendChild(divInfoIniciarTarj);
        divInfoIniciarTarj.appendChild(buttonEmpezar);
        buttonEmpezar.appendChild(svgIconEmpezar);
        svgIconEmpezar.appendChild(defsIconEmpezar);
        defsIconEmpezar.appendChild(pathDefsIconEmpezar1);
        defsIconEmpezar.appendChild(pathDefsIconEmpezar2);
        svgIconEmpezar.appendChild(pathIconEmpezar1);
        svgIconEmpezar.appendChild(pathIconEmpezar2);
        divInfoIniciarTarj.appendChild(divInfoTarjeta);
        divInfoTarjeta.appendChild(spanBienvenida);
        divInfoTarjeta.appendChild(h1Titulo);
        divInfoTarjeta.appendChild(pTextoParrafo);
        divInfoIniciarTarj.appendChild(imgInfoTarjeta);
        divContainerLogin.appendChild(divSeccionFormulario);
        divSeccionFormulario.appendChild(divEncabezadoFormulario);
        divEncabezadoFormulario.appendChild(spanTituloEncabezadoForm);
        divSeccionFormulario.appendChild(divContenidoLogin);
        divContenidoLogin.appendChild(formFormularioLogin);
        formFormularioLogin.appendChild(divFormularioEmail);
        divFormularioEmail.appendChild(labelTextoEmail);
        divFormularioEmail.appendChild(inputFieldEmail);
        formFormularioLogin.appendChild(divFormularioContrasenya);
        divFormularioContrasenya.appendChild(labelTextoContrasenya);
        divFormularioContrasenya.appendChild(inputFieldContrasenya);
        formFormularioLogin.appendChild(divFormularioCheckbox);
        divFormularioCheckbox.appendChild(divFormularioCheckboxCbx);
        divFormularioCheckboxCbx.appendChild(inputFieldCheckbox);
        divFormularioCheckboxCbx.appendChild(labelTextoCheckbox);
        divFormularioCheckboxCbx.appendChild(svgAnimacionChecked);
        svgAnimacionChecked.appendChild(pathAnimacionChecked);
        formFormularioLogin.appendChild(divBtnIniciarSesion);
        divBtnIniciarSesion.appendChild(buttonLogin);
        divContenidoLogin.appendChild(spanSeparadorLogin);
        divContenidoLogin.appendChild(divCuentas);
        divCuentas.appendChild(divCuentaFb);
        divCuentaFb.appendChild(svgLogoFb);
        svgLogoFb.appendChild(gSvgLogoFb1);
        svgLogoFb.appendChild(gSvgLogoFb2);
        svgLogoFb.appendChild(gSvgLogoFb3);
        gSvgLogoFb3.appendChild(circleSvgLogoFb);
        gSvgLogoFb3.appendChild(pathSvgLogoFb);
        divCuentaFb.appendChild(spanTextoAccionFb);
        divCuentas.appendChild(divCuentaGoogle);
        divCuentaGoogle.appendChild(svgLogoGoogle);
        svgLogoGoogle.appendChild(gSvgLogoGoogle1);
        svgLogoGoogle.appendChild(gSvgLogoGoogle2);
        svgLogoGoogle.appendChild(gSvgLogoGoogle3);
        gSvgLogoGoogle3.appendChild(titleGSvgLogoGoogle);
        gSvgLogoGoogle3.appendChild(descGSvgLogoGoogle);
        gSvgLogoGoogle3.appendChild(defsGSvgLogoGoogle);
        gSvgLogoGoogle3.appendChild(gSvgLogoGoogle4);
        gSvgLogoGoogle4.appendChild(gSvgLogoGoogle5);
        gSvgLogoGoogle5.appendChild(gSvgLogoGoogle6);
        gSvgLogoGoogle6.appendChild(pathGSvgLogoGoogle1);
        gSvgLogoGoogle6.appendChild(pathGSvgLogoGoogle2);
        gSvgLogoGoogle6.appendChild(pathGSvgLogoGoogle3);
        gSvgLogoGoogle6.appendChild(pathGSvgLogoGoogle4);
        divCuentaGoogle.appendChild(spanTextoAccionGoogle);
        divContenidoLogin.appendChild(divFooterFormulario);
        divFooterFormulario.appendChild(spanFooterFormInfoTexto);
        divFooterFormulario.appendChild(spanFooterFormlinkRegistro);


        // Creando los eventos pertinentes
    }
}

customElements.define("iniciosesion-component", IniciosesionComponent);