//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_meta_ailment_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_meta_ailment_detail.g.dart';

/// MoveMetaAilmentDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [moves] - A list of moves that cause this ailment.
/// * [names] - The name of this resource listed in different languages.
@BuiltValue()
abstract class MoveMetaAilmentDetail implements Built<MoveMetaAilmentDetail, MoveMetaAilmentDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// A list of moves that cause this ailment.
  @BuiltValueField(wireName: r'moves')
  BuiltList<MoveSummary> get moves;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<MoveMetaAilmentName> get names;

  MoveMetaAilmentDetail._();

  factory MoveMetaAilmentDetail([void updates(MoveMetaAilmentDetailBuilder b)]) = _$MoveMetaAilmentDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveMetaAilmentDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveMetaAilmentDetail> get serializer => _$MoveMetaAilmentDetailSerializer();
}

class _$MoveMetaAilmentDetailSerializer implements PrimitiveSerializer<MoveMetaAilmentDetail> {
  @override
  final Iterable<Type> types = const [MoveMetaAilmentDetail, _$MoveMetaAilmentDetail];

  @override
  final String wireName = r'MoveMetaAilmentDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveMetaAilmentDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(MoveMetaAilmentName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveMetaAilmentDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveMetaAilmentDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>;
          result.moves.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveMetaAilmentName)]),
          ) as BuiltList<MoveMetaAilmentName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveMetaAilmentDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveMetaAilmentDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


