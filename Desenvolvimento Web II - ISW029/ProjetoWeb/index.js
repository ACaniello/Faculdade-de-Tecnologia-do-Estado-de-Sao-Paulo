//const { initializeApp, applicationDefault, cert } = require('firebase-admin/app');
//const { getFirestore, Timestamp, FieldValue } = require('firebase-admin/firestore');

//const serviceAccount = require('projetoweb-66eba-firebase-adminsdk-cfujl-9a4c5aa990.json');

//initializeApp({
  //credential: cert(serviceAccount)
//});

//const db = getFirestore();

//const data = {
  //  name: 'Los Angeles',
  //  state: 'CA',
  //  country: 'USA'
  //};
  
  //const cityRef = db.collection('cities').doc('SF');
  //const doc = await cityRef.get();
  //if (!doc.exists) {
  //  console.log('No such document!');
  //} else {
  //  console.log('Document data:', doc.data());
  //}
  
  // Add a new document in collection "cities" with ID 'LA'
  //const res = await db.collection('projetoweb').doc('LA').set(data);

const { initializeApp, applicationDefault, cert } = require("firebase-admin/app")
const { getFirestore, Timestamp, FieldValue } = require("firebase-admin/firestore")

const serviceAccount = require("")

initializeApp({
  credential: cert(serviceAccount)
})

const db = getFirestore()

const data = {
  name: "name",
  state: "state",
  country: "country"
}

const res = db.collection("schedules").doc("LA").set(data)
  
