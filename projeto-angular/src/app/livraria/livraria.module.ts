import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule} from '@angular/common/http';
import { ListaComponent } from './franquias/lista/lista.component';


@NgModule({
  declarations: [],
  imports: [
    CommonModule, HttpClientModule
  ],
  exports: [ 
    ListaComponent
  ]
})
export class LivrariaModule { }
