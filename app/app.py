Here is an example of Python Flask API code that implements the given user story:

```python
from flask import Flask, request, jsonify

app = Flask(__name__)

# Endpoint for accessing the F&F approval request form
@app.route('/approval-request', methods=['GET'])
def get_approval_request_form():
    # Return the form HTML or render a template
    return "F&F Approval Request Form"

# Endpoint for submitting the F&F approval request
@app.route('/approval-request', methods=['POST'])
def submit_approval_request():
    # Get the case remarks and other relevant details from the request
    case_remarks = request.form.get('case_remarks')
    # Process and validate the data

    # Send the F&F approval request to QC2 / Regional Manager
    # Update the case status to 'F&F Approval Pending with QC2'
    # Send an auto-mailer with the basic case details to QC2

    # Return a success response
    return jsonify({'message': 'F&F approval request submitted successfully'})

# Endpoint for QC2 / Regional Manager to review and provide recommendation
@app.route('/approval-request/<request_id>', methods=['PUT'])
def review_approval_request(request_id):
    # Get the decision and remarks from the request
    decision = request.form.get('decision')
    remarks = request.form.get('remarks')
    # Process and validate the data

    # Capture the decision and remarks
    # Update the case status based on the decision

    # Return a success response
    return jsonify({'message': 'Approval request reviewed successfully'})

if __name__ == '__main__':
    app.run()
```

Please note that this is a basic implementation and you will need to add your own logic for processing the data, sending emails, updating the case status, and capturing the decision. Additionally, you may need to modify the code to fit your specific requirements and integrate it with your existing system.