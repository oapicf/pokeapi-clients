#tag Class
Protected Class PokemonSprites

	#tag Property, Flags = &h0
		#tag Note
			The default depiction of this Pokémon from the front in battle.
		#tag EndNote
		front_default As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The shiny depiction of this Pokémon from the front in battle.
		#tag EndNote
		front_shiny As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The female depiction of this Pokémon from the front in battle.
		#tag EndNote
		front_female As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The shiny female depiction of this Pokémon from the front in battle.
		#tag EndNote
		front_shiny_female As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The default depiction of this Pokémon from the back in battle.
		#tag EndNote
		back_default As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The shiny depiction of this Pokémon from the back in battle.
		#tag EndNote
		back_shiny As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The female depiction of this Pokémon from the back in battle.
		#tag EndNote
		back_female As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The shiny female depiction of this Pokémon from the back in battle.
		#tag EndNote
		back_shiny_female As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
		#tag EndNote
		other As OpenAPIClient.Models.PokemonSpritesOther
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sprites grouped by generation and game. Available keys vary by resource.
		#tag EndNote
		versions As Dictionary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="front_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="front_shiny"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="front_female"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="front_shiny_female"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="back_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="back_shiny"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="back_female"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="back_shiny_female"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="other"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpritesOther"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="versions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


