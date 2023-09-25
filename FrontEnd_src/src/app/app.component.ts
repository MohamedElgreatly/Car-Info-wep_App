import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Frontend';
  Factory_name:any='';
  color:any='';
  country:any='';
  weight:Number| undefined;
  height:Number| undefined;
  distance:Number| undefined;
  price:Number| undefined;
  name_Label:boolean=false;
  color_Label:boolean=false;
  weight_Label:boolean=false;
  height_Label:boolean=false;
  country_Label:boolean=false;
  price_Label:boolean=false;
  distance_Label:boolean=false;
  buttonsControl:boolean=false;
  items:any=[]
  constructor(private http: HttpClient) {

  }
  add(){
    this.buttonsControl=true;
  }
  
  Label(label:string){
    switch (label) {
      case "name":
        this.name_Label=true;
        this.color_Label=this.country_Label=this.distance_Label=this.price_Label=this.height_Label=
        this.weight_Label=false;
        break;
      case "country":
        this.country_Label=true;
        this.color_Label=this.name_Label=this.distance_Label=this.price_Label=this.height_Label=
        this.weight_Label=false;
        // Code to be executed if expression matches value2
        break;
      case "color":
        this.color_Label=true;
        this.country_Label=this.name_Label=this.distance_Label=this.price_Label=this.height_Label=
        this.weight_Label=false;
        // Code to be executed if expression matches value3
        break;
      case "price":
        this.price_Label=true;
        this.color_Label=this.name_Label=this.distance_Label=this.country_Label=this.height_Label=
        this.weight_Label=false;
        // Code to be executed if expression matches value3
        break;
      case "weight":
        this.weight_Label=true;
        this.color_Label=this.name_Label=this.distance_Label=this.price_Label=this.height_Label=
        this.country_Label=false;
        break;
      case "height":
        this.height_Label=true;
        this.color_Label=this.name_Label=this.distance_Label=this.price_Label=this.country_Label=
        this.weight_Label=false;
          break;
      default:
        this.distance_Label=true;
        this.color_Label=this.name_Label=this.country_Label=this.price_Label=this.height_Label=
        this.weight_Label=false;
        // Code to be executed if expression doesn't match any case
        break;
    }
   
  }
  setLabel(label:string){
    switch (label) {
      case "name":
        console.log(this.Factory_name);
        this.http.post(`http://localhost:8080/CarStore/setFactory?name=${this.Factory_name}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
        break;
      case "country":
        this.http.post(`http://localhost:8080/CarStore/setCountry?country=${this.country}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
        break;
      case "color":
        this.http.post(`http://localhost:8080/CarStore/setColor?color=${this.color}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
        break;
      case "price":
        this.http.post(`http://localhost:8080/CarStore/setPrice?price=${this.price}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
        break;
      case "height":
        this.http.post(`http://localhost:8080/CarStore/setHeight?height=${this.height}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
        break;
      case "weight":
        this.http.post(`http://localhost:8080/CarStore/setWeight?weight=${this.weight}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
          break;
      case "distance":
        this.http.post(`http://localhost:8080/CarStore/setDistance?distance=${this.distance}`,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
        break;
    }
 
  }

  Build(){
    this.price_Label=false;
    this.http.post("http://localhost:8080/CarStore/Build",null,{
      responseType:'text',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
    })
  }

  show(){
    this.buttonsControl=false;
    this.http.get<any[]>("http://localhost:8080/CarStore/AllCars",{
      responseType:'json',
      observe:'response'
    }).subscribe(response=>{
      console.log('Data sent successfully!', response);
      this.items=[]
      if (response.body) {
      for (let item of (response.body)) {
        console.log(item); // Do something with each item
        this.items.push(item)
      }
    }
    })

 }
}
