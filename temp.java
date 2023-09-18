<script type="module">
  // Import the functions you need from the SDKs you need
  import { initializeApp } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-app.js";
  import { getAnalytics } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-analytics.js";
  // TODO: Add SDKs for Firebase products that you want to use
  // https://firebase.google.com/docs/web/setup#available-libraries

  // Your web app's Firebase configuration
  // For Firebase JS SDK v7.20.0 and later, measurementId is optional
  const firebaseConfig = {
    apiKey: "AIzaSyA7vfd1bDjMSic_4DLwVGztG9T2Gxq1B20",
    authDomain: "countai-temp.firebaseapp.com",
    projectId: "countai-temp",
    storageBucket: "countai-temp.appspot.com",
    messagingSenderId: "1044305393973",
    appId: "1:1044305393973:web:477341a3134a503cb5747c",
    measurementId: "G-KEPCR8TZGR"
  };

  // Initialize Firebase
  const app = initializeApp(firebaseConfig);
  const analytics = getAnalytics(app);
</script>