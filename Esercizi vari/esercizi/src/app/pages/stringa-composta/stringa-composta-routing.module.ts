import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { StringaCompostaPage } from './stringa-composta.page';

const routes: Routes = [
  {
    path: '',
    component: StringaCompostaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class StringaCompostaPageRoutingModule {}
