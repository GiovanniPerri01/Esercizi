import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { StringaCompostaPageRoutingModule } from './stringa-composta-routing.module';

import { StringaCompostaPage } from './stringa-composta.page';
import { RitornaHomeModule } from 'src/app/components/ritorna-home/ritorna-home.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    StringaCompostaPageRoutingModule,
    RitornaHomeModule
  ],
  declarations: [StringaCompostaPage]
})
export class StringaCompostaPageModule {}
