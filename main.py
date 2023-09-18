import firebase_admin
from firebase_admin import db, credentials

# cred_obj = firebase_admin.credentials.Certificate('credential.json')
# default_app = firebase_admin.initialize_app(cred_object, {
# 	'databaseURL':databaseURL
# 	})

cred = credentials.Certificate('credential.json')
firebase_admin.initialize_app(cred, {
	'databaseURL':"https://console.firebase.google.com/project/countai-temp/database/countai-temp-default-rtdb/data/~2F"
	})

# creating reference to root node
ref = db.reference("/")

print(ref.get())