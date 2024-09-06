export class AppFooterComponent extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({ mode: 'open' });
        this.render();
    }

    render() {
        const shadow = this.shadowRoot;

        const footer = document.createElement('footer');

        const mainContent = document.createElement('div');
        mainContent.classList.add('main-content');

        const leftBox = document.createElement('div');
        leftBox.classList.add('left', 'box');

        const leftBoxTitle = document.createElement('h2');
        leftBoxTitle.textContent = 'About us';

        const leftBoxContent = document.createElement('div');
        leftBoxContent.classList.add('content');

        const leftBoxText = document.createElement('p');
        leftBoxText.textContent = 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book';   


        const social = document.createElement('div');
        social.classList.add('social');

        const socialLinks = [
            { href: 'https://facebook.com/sharadaeshi', icon: 'fab fa-facebook-f' },
            { href: '#', icon: 'fab fa-twitter' },
            { href: 'https://instagram.com/sharadishi09', icon: 'fab fa-instagram' },
            { href: '#', icon: 'fab fa-youtube' },
        ];

        socialLinks.forEach(link => {
            const socialLink = document.createElement('a');
            socialLink.href = link.href;
            const socialIcon = document.createElement('span');
            socialIcon.classList.add(link.icon.replace(/\s/g, '')); // Elimina espacios en blanco
            socialLink.appendChild(socialIcon);
            social.appendChild(socialLink);
        });

        leftBoxContent.appendChild(leftBoxText);
        leftBoxContent.appendChild(social);

        leftBox.appendChild(leftBoxTitle);
        leftBox.appendChild(leftBoxContent);


        const centerBox = document.createElement('div');
        centerBox.classList.add('center', 'box');

        const centerBoxTitle = document.createElement('h2');
        centerBoxTitle.textContent = 'Address';

        const centerBoxContent = document.createElement('div');
        centerBoxContent.classList.add('content');

        const addressDetails = [
            { icon: 'fas fa-map-marker-alt', text: 'Surat, Gujarat' },
            { icon: 'fas fa-phone-alt', text: '+91-1234567890' },
            { icon: 'fas fa-envelope', text: 'abc@example.com' },
        ];

        addressDetails.forEach(detail => {
            const addressDetail = document.createElement('div');
            const detailIcon = document.createElement('span');
            detailIcon.classList.add(detail.icon.replace(/\s/g, '')); // Elimina espacios en blanco
            const detailText = document.createElement('span');
            detailText.classList.add('text');
            detailText.textContent = detail.text;
            addressDetail.appendChild(detailIcon);
            addressDetail.appendChild(detailText);
            centerBoxContent.appendChild(addressDetail);
        });

        centerBox.appendChild(centerBoxTitle);
        centerBox.appendChild(centerBoxContent);

        const rightBox = document.createElement('div');
        rightBox.classList.add('right', 'box');

        const rightBoxTitle = document.createElement('h2');
        rightBoxTitle.textContent = 'Contact us';

        const rightBoxContent = document.createElement('div');
        rightBoxContent.classList.add('content');

        const contactForm = document.createElement('form');
        contactForm.action = '#';

        const emailField = document.createElement('div');
        emailField.classList.add('email');

        const emailLabel = document.createElement('div');
        emailLabel.classList.add('text');
        emailLabel.textContent = 'Email *';

        const emailInput = document.createElement('input');
        emailInput.type = 'email';
        emailInput.required = true;

        const messageField = document.createElement('div');
        messageField.classList.add('msg');

        const messageLabel = document.createElement('div');
        messageLabel.classList.add('text');
        messageLabel.textContent = 'Message *';

        const messageTextarea = document.createElement('textarea');
        messageTextarea.rows = 2;
        messageTextarea.cols = 25;
        messageTextarea.required = true;

        messageField.appendChild(messageLabel);
        messageField.appendChild(messageTextarea);

        // Submit button
        const submitButton = document.createElement('button');
        submitButton.type = 'submit';
        submitButton.textContent = 'Send';

        // Append all elements to the contact form
        contactForm.appendChild(emailField);
        contactForm.appendChild(messageField);
        contactForm.appendChild(submitButton);

        rightBoxContent.appendChild(contactForm);

        rightBox.appendChild(rightBoxTitle);
        rightBox.appendChild(rightBoxContent);

        // Bottom section
        const bottom = document.createElement('div');
        bottom.classList.add('bottom');

        const center = document.createElement('center');

        const credit = document.createElement('span');
        credit.classList.add('credit');
        credit.textContent = 'Created By ';
        const creditLink = document.createElement('a');
        creditLink.href = 'https://sharadishi.vercel.app/';
        creditLink.textContent = 'SharadIshi';
        credit.appendChild(creditLink);
        credit.innerHTML += ' | ';

        const copyrightIcon = document.createElement('span');
        copyrightIcon.classList.add('far', 'fa-copyright');

        const copyrightText = document.createElement('span');
        copyrightText.textContent = ' 2024 All rights reserved.';

        center.appendChild(credit);
        center.appendChild(copyrightIcon);
        center.appendChild(copyrightText);

        bottom.appendChild(center);

        // Append all sections to the main content
        mainContent.appendChild(leftBox);
        mainContent.appendChild(centerBox);
        mainContent.appendChild(rightBox);
        mainContent.appendChild(bottom);

        footer.appendChild(mainContent);

        // Append the footer to the shadow root
        shadow.appendChild(footer);
    }
}

customElements.define("appfooter-component", AppFooterComponent);