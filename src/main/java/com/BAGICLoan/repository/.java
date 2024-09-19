script
// HTML Structure
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Loan Application</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <header>
            <h1>Loan Application</h1>
            <div id="progress-bar"></div>
        </header>
        <form id="loan-form">
            <div class="form-group">
                <label for="name">Name <span class="tooltip">?</span></label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email <span class="tooltip">?</span></label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="amount">Loan Amount <span class="tooltip">?</span></label>
                <input type="number" id="amount" name="amount" required>
            </div>
            <button type="button" id="save-later">Save and Continue Later</button>
            <button type="submit">Submit</button>
        </form>
        <div id="confirmation-message"></div>
        <footer>
            <button id="help">Help</button>
        </footer>
    </div>
    <script src="script.js"></script>
</body>
</html>

// CSS (styles.css)
body {
    font-family: Arial, sans-serif;
}
.container {
    max-width: 600px;
    margin: auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 10px;
}
header {
    text-align: center;
}
#progress-bar {
    height: 20px;
    background-color: #4caf50;
    width: 0;
}
.form-group {
    margin-bottom: 15px;
}
.tooltip {
    cursor: pointer;
    color: #888;
}
#confirmation-message {
    display: none;
    color: green;
}
footer {
    text-align: center;
    margin-top: 20px;
}

// JavaScript (script.js)
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('loan-form');
    const progressBar = document.getElementById('progress-bar');
    const confirmationMessage = document.getElementById('confirmation-message');
    const saveLaterButton = document.getElementById('save-later');
    const helpButton = document.getElementById('help');

    form.addEventListener('input', updateProgressBar);
    form.addEventListener('submit', handleSubmit);
    saveLaterButton.addEventListener('click', saveForLater);
    helpButton.addEventListener('click', showHelp);

    function updateProgressBar() {
        const totalFields = form.querySelectorAll('input').length;
        const filledFields = form.querySelectorAll('input:valid').length;
        const progress = (filledFields / totalFields) * 100;
        progressBar.style.width = `${progress}%`;
    }

    function handleSubmit(event) {
        event.preventDefault();
        if (form.checkValidity()) {
            confirmationMessage.textContent = 'Application submitted successfully!';
            confirmationMessage.style.display = 'block';
            sendConfirmationEmail();
        }
    }

    function saveForLater() {
        localStorage.setItem('loanFormData', JSON.stringify(Object.fromEntries(new FormData(form))));
        alert('Your progress has been saved.');
    }

    function showHelp() {
        alert('For assistance, please contact our support team.');
    }

    function sendConfirmationEmail() {
        // Simulate sending email
        console.log('Confirmation email sent.');
    }

    // Load saved data if available
    const savedData = JSON.parse(localStorage.getItem('loanFormData'));
    if (savedData) {
        Object.entries(savedData).forEach(([key, value]) => {
            form.elements[key].value = value;
        });
        updateProgressBar();
    }
});
