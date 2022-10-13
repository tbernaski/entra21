import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Hero } from '../heroes-screen/heroes-screen.component';

@Component({
  selector: 'app-heroes-form',
  templateUrl: './heroes-form.component.html',
  styleUrls: ['./heroes-form.component.css']
})
export class HeroesFormComponent implements OnChanges{

  @Input() editingHero? : Hero | null | undefined;
  @Output() insertChange = new EventEmitter<boolean>();
  @Output() heroSave = new EventEmitter<Hero>();

  heroForm = new FormGroup ({
    id: [null],
    name: new FormGroup ('', Validators.required),
    secretIdentity: new FormControl ('')
    
  })

cancel = () =>{
  this.insertChange.emit(false);
}

  onSubmit = () =>{
  this.heroSave.emit(this.heroForm.value as Hero);
  this.heroForm.reset();
  this.cancel();
}

remove = (hero:Hero) =>{
this.heroes = this.heroes.filter((h:Hero) => h.id! != hero.id!);

}
  heroes: any;
constructor (privatefb:FormBuilder){}
  ngOnChanges(changes: SimpleChanges): void {
    this.heroForm.patchValue(changes["editingHero"].currentValue);
}
}
