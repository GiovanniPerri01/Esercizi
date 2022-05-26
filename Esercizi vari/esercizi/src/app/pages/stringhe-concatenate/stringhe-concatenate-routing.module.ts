import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { StringheConcatenatePage } from './stringhe-concatenate.page';

const routes: Routes = [
  {
    path: '',
    component: StringheConcatenatePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class StringheConcatenatePageRoutingModule {}
