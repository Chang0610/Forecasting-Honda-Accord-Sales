Last login: Wed Sep 25 13:50:59 on ttys000
(base) sususu@Sususus-MacBook ~ % open -e app.py
from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()
    features = data['features']
    prediction = [42]  # Replace with your actual model prediction logic
    return jsonify({'prediction': prediction})

if __name__ == '__main__':
    app.run(debug=True, port=5001)









