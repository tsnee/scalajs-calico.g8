package $package$

import calico.*
import calico.html.io.{*, given}
import cats.effect.*
import fs2.dom.*

object MyCalicoApp extends IOWebApp:
  def render: Resource[IO, HtmlElement[IO]] =
    div("Toto, I've a feeling we're not in Kansas anymore.")
