#tag Class
Protected Class MachineDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		version_group As OpenAPIClient.Models.VersionGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		move As OpenAPIClient.Models.MoveSummary
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


