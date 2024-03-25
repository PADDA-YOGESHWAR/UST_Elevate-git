import os
import google.generativeai as genai


class ChatSession:
    def __init__(self):
        # Initialize your chat session here
        pass

    def send_message(self, prompt: str, stream: bool = False) -> str:
        # Send a message to the chat session and return the response
        pass

# Set your Google API Key
os.environ['GOOGLE_API_KEY'] = "AIzaSyAWugepsBXxn3a8ScyD1vcsS-poaX87pik"

# Initialize the google-generativeai library
genai.configure(api_key=os.environ['GOOGLE_API_KEY'])

# Instantiate a GenerativeModel object
model = genai.GenerativeModel('gemini-pro')

# Create a chat session
chat = model.start_chat()

# Define a function to get a chat response
def get_chat_response(chat: ChatSession, prompt: str) -> str:
    text_response = ""
    try:
        responses = chat.send_message(prompt, stream=True)
        for chunk in responses:
            text_response += chunk.text
    except Exception as e:
        print("An error occurred:", e)
    return text_response

# Get a chat response
while True:
    prompt = input("Enter the prompt: ")
    if prompt.lower() == 'q':
        print("Exiting the program.")
        break
    print(get_chat_response(chat, prompt))
